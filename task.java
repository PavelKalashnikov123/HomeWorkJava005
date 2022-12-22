import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * task
 */
public class task {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Directory directory = new Directory();

        directory.add("Карякин", "8999123321");
        directory.add("Карякин", "8918155326");
        directory.add("Аблов", "8918155552");
        directory.add("Аблов", "8918455672");
        directory.add("Карякин", "899999999");
        directory.add("Белов", "899111111");
        directory.add("Аблов", "89923231999");
        directory.add("Гармаш", "8888123113");
        directory.add("Белов", "8324325234");

        System.out.println(directory.get("Карякин"));
        System.out.println(directory.get("Белов"));
        System.out.println(directory.get("Аблов"));
        System.out.println(directory.get("Гармаш"));
    }
}

class Directory {
    private Map<String, List<String>> directory_hm = new HashMap<>();
    private List<String> phone_number_list;

    public void add(String surname, String phone_number) {
        if (directory_hm.containsKey(surname)) {
            phone_number_list = directory_hm.get(surname);
            phone_number_list.add(phone_number);
            directory_hm.put(surname, phone_number_list);
        } else {
            phone_number_list = new ArrayList<>();
            phone_number_list.add(phone_number);
            directory_hm.put(surname, phone_number_list);
        }
    }

    public List<String> get(String surname) {
        return directory_hm.get(surname);
    }
}
