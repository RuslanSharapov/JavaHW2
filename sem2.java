//           Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE этого запроса, используя StringBuilder. 
//           Данные для фильтрации приведены ниже в виде json-строки. Если значение null, то параметр не должен попадать в запрос.

//                       Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}

import java.util.HashMap;
import java.util.Scanner;

public class sem2 {
    public static void main(String[] args) {
        HashMap<String, String> filters = new HashMap<String, String>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите имя: ");
        String name = sc.nextLine();
        if (!name.equals("")) {
            filters.put("name", name);
        }

        System.out.print("Введите страну: ");
        String country = sc.nextLine();
        if (!country.equals("")) {
            filters.put("country", country);
        }

        System.out.print("Введите город: ");
        String city = sc.nextLine();
        if (!city.equals("")) {
            filters.put("city", city);
        }

        System.out.print("Введите ваш возраст: ");
        String age = sc.nextLine();
        sc.close();
        if (!age.equals("")) {
            filters.put("age", age);
        }

        StringBuilder sb = new StringBuilder();
        sb.append("select * from students where ");

        for (String key : filters.keySet()) {
            if (filters.get(key) != null) {
                sb.append(key).append("='").append(filters.get(key)).append("' and ");
            }
        }
        // Удаляем последний "and"
        sb.delete(sb.length() - 5, sb.length());

        String whereClause = sb.toString();

        System.out.println(whereClause);
    }
}
