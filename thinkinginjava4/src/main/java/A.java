import com.google.common.collect.Lists;

import java.io.File;
import java.util.List;
import java.util.Random;

/**
 * @Author <a href='http://www.cherrycheng.com' target='_blank'>cherrycheng.com</a>
 * Created by ChengRu on 2017-12-04.
 */
public class A {
    public static void main(String[] args) {
        List<Integer> list = Lists.newArrayList();
        StringBuilder builder = new StringBuilder();
        for(int i=0;i<25;i++) {
            builder.append("i=").append(i);
            int current = (int) (Math.random()*10);
            builder.append(",当前数=").append(current);
            list.add(current);
            if ((i - 1) >= 0) {
                Integer before = list.get(i-1);
                builder.append(",上一个数=").append(before);
                if (current > before) {
                    builder.append(",当前数大于上一个数.");
                }
                if (current < before) {
                    builder.append(",当前数小于上一个数.");
                }
                if (current == before) {
                    builder.append(",当前数等于上一个数.");
                }
            }else{
                builder.append(",无上一个数.");
            }
            builder.append("\n");
        }
        System.out.println(builder);
        System.out.println(list.size());
    }
}
