package test2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Test2 {

    public static void main(String[] args) {
        String birthdayStr = "2000-01-01";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate birthday = LocalDate.parse(birthdayStr, formatter);

        // 获取今天的日期
        LocalDate today = LocalDate.now();

        // 获取今年的生日
        LocalDate thisYearBirthday = birthday.withYear(today.getYear());

        // 判断今年是否已过生日
        boolean hasPassed;
        LocalDate nextBirthday;

        if (today.isAfter(thisYearBirthday)) {
            // 今年生日已过，下一次生日是明年
            hasPassed = true;
            nextBirthday = birthday.withYear(today.getYear() + 1);
        } else if (today.isEqual(thisYearBirthday)) {
            // 今天就是生日
            hasPassed = false;
            nextBirthday = thisYearBirthday;
        } else {
            // 今年生日还没到
            hasPassed = false;
            nextBirthday = thisYearBirthday;
        }

        // 计算距离下一次生日的天数
        long daysUntilNextBirthday = ChronoUnit.DAYS.between(today, nextBirthday);

        // 格式化输出
        System.out.println("生日：" + birthday.format(formatter));
        System.out.println("今天：" + today.format(formatter));
        System.out.println("今年生日：" + thisYearBirthday.format(formatter));
        System.out.println("今年是否已过生日：" + (hasPassed ? "是" : "否"));
        System.out.println("下一次生日：" + nextBirthday.format(formatter));
        System.out.println("距离下一次生日还有：" + daysUntilNextBirthday + " 天");
    }
}
