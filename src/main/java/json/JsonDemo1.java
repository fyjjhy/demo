//package json;
//
//import net.sf.json.JSONArray;
//import net.sf.json.JSONObject;
//import org.apache.commons.lang3.StringEscapeUtils;
//
///**
// * <Description> <br>
// *
// * @author 付永杰<br>
// * @version 1.0<br>
// * @taskId <br>
// * @CreateDate 2019年08月09日 <br>
// * @see json <br>
// * @since V1.0 <br>
// */
//public class JsonDemo1 {
//
//    public static void main(String[] args) {
//        String params = "[{\\\"contractCode\\\":\\\"prod01\\\",\\\"customerCode\\\":\\\"28D03CBAB37EDB5B72931756395E2565\\\",\\\"docTitle\\\":\\\"\\u82CF\\u5DDE\\u6E2F\\u534E\\u7528\\u6C14\\u5408\\u540C\\\",\\\"parameterMap\\\":{\\\"companySignDay\\\":\\\"06\\\",\\\"companySignMonth\\\":\\\"06\\\",\\\"companySignYear\\\":\\\"2019\\\",\\\"personSignDay\\\":\\\"06\\\",\\\"personSignMonth\\\":\\\"06\\\",\\\"personSignName\\\":\\\"\\u5F90\\u5468\\\",\\\"personSignYear\\\":\\\"2019\\\"},\\\"returnUrl\\\":\\\"http://www.baidu.com\\\",\\\"state\\\":\\\"100ccssss\\\",\\\"templateCode\\\":\\\"HTMB190605000009\\\"}]";
//        params = StringEscapeUtils.unescapeJava(params);
//        System.out.println("params:" + params);
//        JSONArray array = JSONArray.fromObject(params);
//        if (array.size() > 0) {
//            for (int i = 0, len = array.size(); i < len; i++) {
//                JSONObject object = array.getJSONObject(i);
//                System.out.println(object.get("contractCode") + "=");
//            }
//        }
//    }
//}
