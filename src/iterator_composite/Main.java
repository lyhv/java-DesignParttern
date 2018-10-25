package iterator_composite;

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
 * <p>
 * Dùng để quản lý một conlection
 * <p>
 * The Interactor pattern provider to access elements
 * <p>
 * <p>
 * Composite pattern dùng để quản lý conlection theo dạng tree struct
 */
public class Main {
    public static void main(String[] args) {
        Corporattion corporattion = new Corporattion();
        Corporate Node = new Division("CEO");
        Corporate vp1 = new VP("HOANG", "CEO");
        Corporate vp2 = new VP("NGOC", "CEO");
        Corporate division1 = new Division("NGOC");
        Corporate vpLAN = new VP("LAN", "MANAGER");
        Corporate vpDep = new VP("DIEP", "MANAGER");
        Corporate vpDong = new VP("DONG", "MANAGER");
        division1.add(vpLAN);
        division1.add(vpDep);
        division1.add(vpDong);
        Node.add(vp1);
        Node.add(vp2);
        Node.add(division1);
        corporattion.add(Node);
        corporattion.print();
    }
}
