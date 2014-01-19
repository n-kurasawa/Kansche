package com.kansche.service;

import static com.kansche.entity.M01UserNames.userId;
import static com.kansche.entity.M01UserNames.deleteFlg;
import static com.kansche.entity.M01UserNames.loginId;
import static com.kansche.entity.M01UserNames.password;
import static org.seasar.extension.jdbc.operation.Operations.asc;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Generated;

import org.seasar.extension.jdbc.where.SimpleWhere;

import com.kansche.dto.UserDto;
import com.kansche.entity.M01User;
import com.kansche.util.Const;

/**
 * {@link M01User}のサービスクラスです。
 *
 */
@Generated(value = {"S2JDBC-Gen 2.4.45", "org.seasar.extension.jdbc.gen.internal.model.ServiceModelFactoryImpl"}, date = "2012/12/22 19:35:39")
public class M01UserService extends AbstractService<M01User> {

    /**
     * 識別子でエンティティを検索します。
     *
     * @param userId
     *            識別子
     * @return エンティティ
     */
    public M01User findById(Integer userId) {
        return select().id(userId).getSingleResult();
    }

    /**
     * 識別子の昇順ですべてのエンティティを検索します。
     *
     * @return エンティティのリスト
     */
    public List<M01User> findAllOrderById() {
        return select().orderBy(asc(userId())).getResultList();
    }

    /**
     * 削除フラグが立っていないユーザを検索します。
     * @return
     */
    public List<M01User> findNotDeleteUserOrderById() {
        return select().where(new SimpleWhere().ne(deleteFlg(), Const.FLG_ON))
        		.orderBy(asc(userId())).getResultList();
    }

    /**
     * ログインIDとパスワードでユーザを検索します。
     * @param loginId
     * @param password
     * @return 検索されたユーザエンティティ
     */
    public M01User findByLoginIdAndPassword(String loginId, String password) {
		return select().where(
				new SimpleWhere().eq(loginId(), loginId).eq(password(),password))
				.getSingleResult();

    }

    /**
     * M01Userをインサートします。
     *
     * @param dto
     */
    public void insert(UserDto dto) {

    	M01User user = createEntity(dto);

    	insert(user);

    }

    /**
     * M01Userをアップデートします。
     *
     * @param dto
     */
    public void update(UserDto dto) {

    	M01User user = createEntity(dto);

    	update(user);

    }

    /**
     * ユーザIDで検索しUserDtoを返します。
     *
     * @param userId
     * @return UserDto
     */
    public UserDto getUserDtoById(Integer userId) {
    	M01User user = findById(userId);

    	return createDto(user);

    }

    /**
     * 全てのユーザのDTOを返します。
     * @return dtos
     */
    public List<UserDto> getUserDtos() {
    	List<UserDto> dtos = new ArrayList<UserDto>();
    	List<M01User> users = findNotDeleteUserOrderById();

    	for (M01User user : users) {
    		UserDto dto = createDto(user);
    		dtos.add(dto);
    	}
    	return dtos;
    }

	private M01User createEntity(UserDto dto) {
		M01User user = new M01User();

		user.userId = dto.userId;
    	user.userName = dto.userName;
    	user.loginId = dto.loginId;
    	user.password = dto.password;
    	user.adminFlg = dto.adminFlg == null ? Const.Flg_OFF : Const.FLG_ON;
    	user.deleteFlg = Const.Flg_OFF;
		return user;
	}

	private UserDto createDto(M01User user) {
		UserDto dto = new UserDto();
		dto.userId = user.userId;
		dto.userName = user.userName;
		dto.loginId = user.loginId;
		dto.password = user.password;
		dto.adminFlg = user.adminFlg;

		return dto;
	}

	/**
	 * ユーザを物理削除します。
	 * @param updateDaleteId
	 */
	public void physicalDelete(String updateDaleteId) {
		M01User m01User = new M01User();
		m01User.userId = Integer.valueOf(updateDaleteId);
		delete(m01User);
	}

	/**
	 * ユーザを論理削除します。
	 * @param updateDaleteId
	 */
	public void logicalDelete(String updateDaleteId) {
		M01User m01User = new M01User();
		m01User.userId = Integer.valueOf(updateDaleteId);
		m01User.deleteFlg = Const.FLG_ON;
		jdbcManager.update(m01User).excludesNull().execute();

	}

}