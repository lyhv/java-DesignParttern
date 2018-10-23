package iterator;

/**
 * @author Ho Van Ly
 * Cung cấp cách truy cập tuần tự tới các phần tử của một đối tượng tổng hợp mà không phải tạo riêng các phương pháp
 * truy cập cho đối tượng này.
 * <p>
 * Phù hợp với các đói tượng xây dựng theo dạng cây, theo nhánh...
 * phụ hợp với các phần tử trong tâp hợp lại có tập hợp riêng và có cùng tính chất
 * <p>
 * Bài toán:
 * gồm một công ty, gôm nhiều bộ phận, mỗi bộ phận lại có tập hợp nhân viên
 * -> duyệt, thêm, một node bất kì trong công ty
 */
public class Main {
    public static void main(String[] args) {
        Corporattion corporattion = new Corporattion();
        Division division1 = new Division("CEO");
        division1.add(new VP("HOANG", "CEO"));
        Division division2 = new Division("MANAGER");
        division2.add(new VP("NHUNG", "TEAM_LEADER"));
        corporattion.add(division1);
        corporattion.add(division2);
        corporattion.print();
    }
}
