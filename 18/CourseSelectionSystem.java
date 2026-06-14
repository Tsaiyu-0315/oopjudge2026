import java.util.ArrayList;
import java.util.List;

/**
 * 處理課程的新增、移除與顯示。
 */
public class CourseSelectionSystem {

    /**
     * 依序執行所有課程操作指令。
     *
     * @param commands 要執行的指令
     * @return 所有輸出結果
     */
    public static String process(String[] commands) {
        List<String> courses = new ArrayList<>();
        StringBuilder result = new StringBuilder();

        for (String command : commands) {
            command = command.trim();

            if (command.equals("list")) {
                if (courses.isEmpty()) {
                    addOutput(result, "No courses");
                } else {
                    addOutput(result, String.join(", ", courses));
                }
            } else if (command.startsWith("add ")) {
                String courseName = command.substring(4).trim();

                if (findCourse(courses, courseName) != -1) {
                    addOutput(result, "Course already exists");
                } else {
                    courses.add(courseName);
                }
            } else if (command.startsWith("remove ")) {
                String courseName = command.substring(7).trim();
                int index = findCourse(courses, courseName);

                if (index == -1) {
                    addOutput(result, "Course not found");
                } else {
                    courses.remove(index);
                }
            }
        }

        return result.toString();
    }

    /**
     * 尋找課程，不區分大小寫。
     */
    private static int findCourse(List<String> courses, String courseName) {
        for (int i = 0; i < courses.size(); i++) {
            if (courses.get(i).equalsIgnoreCase(courseName)) {
                return i;
            }
        }

        return -1;
    }

    /**
     * 加入一行輸出。
     */
    private static void addOutput(StringBuilder result, String text) {
        if (result.length() > 0) {
            result.append("\n");
        }

        result.append(text);
    }
}
