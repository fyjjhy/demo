package basics.date;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import common.CommonUtil;
import entity.PayInfoRecord;
import utils.DateUtil.DateUtil;

/**
 * <Description> <br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019/5/18
 * @see basics.date <br>
 * @since V1.0<br>
 */
public class DateDemo5 {

	public static void main(String[] args) {
		List<PayInfoRecord> infoRecordList = new ArrayList<>();
		PayInfoRecord infoRecord = new PayInfoRecord();
		infoRecord.setKey(1);
		infoRecord.setBillType("2003");
		infoRecord.setChargeType("AC001");
		infoRecord.setId(CommonUtil.getTransactionID());
		infoRecord.setPayCreateTime(DateUtil.string2Date("2019-04-30 17:38:41"));
		infoRecord.setPayType("0");
		infoRecord.setTotalFee(340);
		infoRecordList.add(infoRecord);

		PayInfoRecord infoRecord2 = new PayInfoRecord();
		infoRecord2.setKey(2);
		infoRecord2.setBillType("2003");
		infoRecord2.setChargeType("AC001");
		infoRecord2.setId(CommonUtil.getTransactionID());
		infoRecord2.setPayCreateTime(DateUtil.string2Date("2019-04-30 17:07:49"));
		infoRecord2.setPayType("0");
		infoRecord2.setTotalFee(340);
		infoRecordList.add(infoRecord2);

		PayInfoRecord infoRecord3 = new PayInfoRecord();
		infoRecord3.setKey(3);
		infoRecord3.setBillType("2003");
		infoRecord3.setChargeType("AC001");
		infoRecord3.setId(CommonUtil.getTransactionID());
		infoRecord3.setPayCreateTime(DateUtil.string2Date("2019-04-30 17:00:25"));
		infoRecord3.setPayType("0");
		infoRecord3.setTotalFee(340);
		infoRecordList.add(infoRecord3);

		PayInfoRecord infoRecord4 = new PayInfoRecord();
		infoRecord4.setKey(4);
		infoRecord4.setBillType("2003");
		infoRecord4.setChargeType("AC001");
		infoRecord4.setId(CommonUtil.getTransactionID());
		infoRecord4.setPayCreateTime(DateUtil.string2Date("2019-04-30 17:00:25"));
		infoRecord4.setPayType("0");
		infoRecord4.setTotalFee(340);
		infoRecordList.add(infoRecord4);

		PayInfoRecord infoRecord5 = new PayInfoRecord();
		infoRecord5.setKey(5);
		infoRecord5.setBillType("2003");
		infoRecord5.setChargeType("AC001");
		infoRecord5.setId(CommonUtil.getTransactionID());
		infoRecord5.setPayCreateTime(DateUtil.string2Date("2019-04-30 17:00:25"));
		infoRecord5.setPayType("0");
		infoRecord5.setTotalFee(340);
		infoRecordList.add(infoRecord5);

		PayInfoRecord infoRecord6 = new PayInfoRecord();
		infoRecord6.setKey(6);
		infoRecord6.setBillType("2003");
		infoRecord6.setChargeType("AC001");
		infoRecord6.setId(CommonUtil.getTransactionID());
		infoRecord6.setPayCreateTime(DateUtil.string2Date("2019-04-30 17:00:25"));
		infoRecord6.setPayType("0");
		infoRecord6.setTotalFee(340);
		infoRecordList.add(infoRecord6);

		PayInfoRecord infoRecord7 = new PayInfoRecord();
		infoRecord7.setKey(7);
		infoRecord7.setBillType("2003");
		infoRecord7.setChargeType("AC001");
		infoRecord7.setId(CommonUtil.getTransactionID());
		infoRecord7.setPayCreateTime(DateUtil.string2Date("2019-04-30 17:00:25"));
		infoRecord7.setPayType("0");
		infoRecord7.setTotalFee(340);
		infoRecordList.add(infoRecord7);

		PayInfoRecord infoRecord8 = new PayInfoRecord();
		infoRecord8.setKey(8);
		infoRecord8.setBillType("2003");
		infoRecord8.setChargeType("AC001");
		infoRecord8.setId(CommonUtil.getTransactionID());
		infoRecord8.setPayCreateTime(DateUtil.string2Date("2019-04-30 17:00:25"));
		infoRecord8.setPayType("0");
		infoRecord8.setTotalFee(340);
		infoRecordList.add(infoRecord8);

		PayInfoRecord infoRecord9 = new PayInfoRecord();
		infoRecord9.setKey(9);
		infoRecord9.setBillType("2003");
		infoRecord9.setChargeType("AC001");
		infoRecord9.setId(CommonUtil.getTransactionID());
		infoRecord9.setPayCreateTime(DateUtil.string2Date("2019-04-30 17:00:25"));
		infoRecord9.setPayType("0");
		infoRecord9.setTotalFee(340);
		infoRecordList.add(infoRecord9);

		PayInfoRecord infoRecord10 = new PayInfoRecord();
		infoRecord10.setKey(10);
		infoRecord10.setBillType("2003");
		infoRecord10.setChargeType("AC001");
		infoRecord10.setId(CommonUtil.getTransactionID());
		infoRecord10.setPayCreateTime(DateUtil.string2Date("2019-04-30 17:00:25"));
		infoRecord10.setPayType("0");
		infoRecord10.setTotalFee(340);
		infoRecordList.add(infoRecord10);

		PayInfoRecord infoRecord11 = new PayInfoRecord();
		infoRecord11.setKey(11);
		infoRecord11.setBillType("2003");
		infoRecord11.setChargeType("AC001");
		infoRecord11.setId(CommonUtil.getTransactionID());
		infoRecord11.setPayCreateTime(DateUtil.string2Date("2019-04-30 17:00:25"));
		infoRecord11.setPayType("0");
		infoRecord11.setTotalFee(340);
		infoRecordList.add(infoRecord11);
		Collections.sort(infoRecordList);
		IntStream.range(0, infoRecordList.size())
				.mapToObj(key -> {
					int count = key + 1;
					System.out.println(count);
					PayInfoRecord payInfoRecord = infoRecordList.get(key);
					payInfoRecord.setKey(count);
					return payInfoRecord;
				}).collect(Collectors.toList());
		System.out.println(infoRecordList.toString());
	}

}
