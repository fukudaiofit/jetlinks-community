import org.junit.jupiter.api.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class mtest {
    @Test
    public void test0(){
        final Date date = new Date(Long.parseLong(String.valueOf(System.currentTimeMillis())));//新建一个时间对象
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//你要转换成的时间格式,大小写不要变
        final String yourtime = sdf.format(date);//转换你的时间
        System.out.println(yourtime);
    }
}
