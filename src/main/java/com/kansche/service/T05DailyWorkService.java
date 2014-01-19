package com.kansche.service;

import static com.kansche.entity.T05DailyWorkNames.userId;
import static com.kansche.entity.T05DailyWorkNames.workYmd;
import static org.seasar.extension.jdbc.operation.Operations.asc;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.annotation.Generated;

import org.seasar.extension.jdbc.where.SimpleWhere;

import com.kansche.dto.DailyWorkDto;
import com.kansche.entity.T05DailyWork;
import com.kansche.util.DateUtil;

/**
 * {@link T05DailyWork}のサービスクラスです。
 *
 */
@Generated(value = {"S2JDBC-Gen 2.4.45", "org.seasar.extension.jdbc.gen.internal.model.ServiceModelFactoryImpl"}, date = "2012/12/22 19:35:39")
public class T05DailyWorkService extends AbstractService<T05DailyWork> {

    /**
     * 識別子でエンティティを検索します。
     *
     * @param userId
     *            識別子
     * @param workYmd
     *            識別子
     * @return エンティティ
     */
    public T05DailyWork findById(Integer userId, String workYmd) {
        return select().id(userId, workYmd).getSingleResult();
    }

    /**
     * 識別子の昇順ですべてのエンティティを検索します。
     *
     * @return エンティティのリスト
     */
    public List<T05DailyWork> findAllOrderById() {
        return select().orderBy(asc(userId()), asc(workYmd())).getResultList();
    }

    /**
     * 引数に渡した日付の期間の作業予定実績のエンティティを返します。
     * @param userId
     * @param fromYmd
     * @param toYmd
     * @return 作業予定実績DTOリスト
     */
    public List<T05DailyWork> findByFromYmdAndToYmd(Integer userId, String fromYmd, String toYmd) {

		return select()
				.where(new SimpleWhere().eq(userId(), userId)
						.ge(workYmd(), fromYmd).le(workYmd(), toYmd))
				.orderBy(asc(workYmd())).getResultList();
    }

    /**
     * 引数に渡した日付の週の作業予定実績DTOを返します。
     * @param userId
     * @param date
     * @return 作業予定実績DTOリスト
     */
	public List<DailyWorkDto> getDailyWorkDtos(Integer userId, Date date) {

		Date monday = DateUtil.getMonday(date);
		Date sunday = DateUtil.getSunday(date);

		String strMonday = DateUtil.getStrDate(monday);
		String strSunday = DateUtil.getStrDate(sunday);

		List<T05DailyWork> dailyWorks = findByFromYmdAndToYmd(userId, strMonday, strSunday);
		List<DailyWorkDto> dailyWorkDtos = new ArrayList<DailyWorkDto>();

		// 検索されたエンティティがない場合は日付とユーザIDをセットしたDTOリストを作成します。
		if (dailyWorks.size() == 0) {
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(monday);
			for (int i = 0; i < 7; i++) {
				if (i != 0) {
					calendar.add(Calendar.DAY_OF_MONTH, 1);
				}
				dailyWorkDtos.add(createEmptyDto(userId, calendar.getTime()));
			}

		} else {
			for (T05DailyWork dailyWork : dailyWorks) {
				dailyWorkDtos.add(createDto(dailyWork));
			}

//			int count = 0;
//			for (T05DailyWork dailyWork : dailyWorks) {
//				String ymd = DateUtil.getStrDate(calendar.getTime());
//				for (int i = 0; i < 7; i++) {
//					if (count != i) {
//						continue;
//					}
//					// 検索されたエンティティからDTOを作成します。
//					if (ymd.equals(dailyWork.workYmd)) {
//						dailyWorkDtos.add(createDto(dailyWork));
//
//					// 検索されたエンティティリストにない日付には空のDTOを作成します。
//					} else {
//						dailyWorkDtos.add(createEmptyDto(userId, calendar.getTime()));
//					}
//					count++;
//					calendar.add(Calendar.DAY_OF_MONTH, 1);
//					break;
//				}
//			}
		}
		return dailyWorkDtos;
	}

	/**
	 * 挿入、更新処理です。
	 * @param dailyWorkDtos
	 */
	public void updateOrInsert(DailyWorkDto dailyWorkDto) {
		T05DailyWork dailyWork = findById(dailyWorkDto.userId, dailyWorkDto.workYmd);
		if (dailyWork == null) {
			insert(createEntity(dailyWorkDto));
		} else {
			setEntity(dailyWork, dailyWorkDto);
			update(dailyWork);
		}
	}

	/**
	 * 一括挿入、更新処理です。
	 * @param dailyWorkDtos
	 */
	public void updateOrInsertAll(List<DailyWorkDto> dailyWorkDtos) {
		List<T05DailyWork> dailyWorks = new ArrayList<T05DailyWork>();
		for (DailyWorkDto dailyWorkDto : dailyWorkDtos) {
			dailyWorks.add(createEntity(dailyWorkDto));
		}

		DailyWorkDto dto = dailyWorkDtos.get(0);
		T05DailyWork dailyWork = findById(dto.userId, dto.workYmd);
		if (dailyWork == null) {
			jdbcManager.insertBatch(dailyWorks).execute();
		} else {
			jdbcManager.updateBatch(dailyWorks).execute();
		}
	}

	private DailyWorkDto createDto(T05DailyWork dailyWork) {
		DailyWorkDto dailyWorkDto = new DailyWorkDto();
		dailyWorkDto.userId = dailyWork.userId;
		dailyWorkDto.workYmd = dailyWork.workYmd;
		dailyWorkDto.schedule = dailyWork.schedule;
		dailyWorkDto.results = dailyWork.results;
		dailyWorkDto.keepPoint = dailyWork.keepPoint;
		dailyWorkDto.problemPoint = dailyWork.problemPoint;
		dailyWorkDto.tryPoint = dailyWork.tryPoint;
		dailyWorkDto.startTimeH = dailyWork.startTimeH;
		dailyWorkDto.startTimeM = dailyWork.startTimeM;
		dailyWorkDto.finishTimeH= dailyWork.finishTimeH;
		dailyWorkDto.finishTimeM = dailyWork.finishTimeM;

		return dailyWorkDto;
	}

	/**
	 * DTOからエンティティを作成します。
	 * @param dailyWorkDto
	 * @return
	 */
	private T05DailyWork createEntity(DailyWorkDto dailyWorkDto) {
		T05DailyWork dailyWork = new T05DailyWork();
		dailyWork.userId = dailyWorkDto.userId;
		dailyWork.workYmd = dailyWorkDto.workYmd;
		setEntity(dailyWork, dailyWorkDto);

		return dailyWork;
	}

	private void setEntity(T05DailyWork dailyWork, DailyWorkDto dailyWorkDto) {
		dailyWork.schedule = dailyWorkDto.schedule;
		dailyWork.results = dailyWorkDto.results;
		dailyWork.keepPoint = dailyWorkDto.keepPoint;
		dailyWork.problemPoint = dailyWorkDto.problemPoint;
		dailyWork.tryPoint = dailyWorkDto.tryPoint;
		dailyWork.startTimeH = dailyWorkDto.startTimeH;
		dailyWork.startTimeM = dailyWorkDto.startTimeM;
		dailyWork.finishTimeH = dailyWorkDto.finishTimeH;
		dailyWork.finishTimeM = dailyWorkDto.finishTimeM;
		dailyWork.deleteFlg = 0;
	}

	/**
	 * ユーザIDと日付のみセットした空のDTOを作成します。
	 * @param userId
	 * @param date
	 * @return
	 */
	private DailyWorkDto createEmptyDto(Integer userId, Date date) {
		DailyWorkDto dailyWorkDto = new DailyWorkDto();
		dailyWorkDto.userId = userId;
		dailyWorkDto.workYmd = DateUtil.getStrDate(date);
		return dailyWorkDto;

	}

}