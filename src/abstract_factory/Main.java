package abstract_factory;

/**
 * @author Sumiu
 * Xây dựng interface để tạo dựng đối tượng, mà không cần quy định lớp
 * hay xác định lớp cụ thể tạo đối tượng
 * Bài Toán: Project cần kết nói đến nhiều cơ sỡ dữ liêu: sqlserver, orcal, mysql...
 * ==> Connection sẽ dễ thay đổi, tách phần connection này ra riêng...
 * Sẽ giao quền lựu chọn kết nối cho lớp con()
 * Lớp cha xây dựng, và để lớp con quết định setup
 *
 * Onpen for extenstion but close for modification
 */
public class Main {
    public static void main(String[] args) {
        FactoryConnection mFactoryConnection = new FactoryConnection();
        Connection connection = mFactoryConnection.createConnection("Oracle");
        System.out.println(connection.description());
    }
}
