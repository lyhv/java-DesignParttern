package proxy;

/**
 * @author asiantech
 * Cung cấp đối tượng đại diện cho một đối tượng khác nhằm mục đích
 * để kiểm soát hoạc hỗ trợ quá trình truy xuất của đối tượng. đói tượng thay thế
 * gọi là proxy
 * Proxy Pattern là mẫu thiết kế mà ở đó tất cả các truy cập trực tiếp đến một đối tượng nào đó sẽ được chuyển hướng vào một đối tượng trung gian (Proxy Class).
 * <p>
 * Khi nào dùng nó?
 * - Khi bạn muốn bảo vệ quyền truy xuất vào các chức năng (phương thức) của thực thể.
 * - Bổ sung trước khi thực hiện phương thức của thực thể.
 * - Tạo đối tượng với chức năng được nâng cao theo yêu cầu.
 * phân Loại
 * – Remote Proxy: Client truy cập qua Remote Proxy để chiếu tới một đối tượng được bảo về nằm bên ngoài ứng dụng (trên cùng máy hoặc máy khác).
 * – Virtual Proxy: Virtual Proxy tạo ra một đối tượng trung gian mỗi khi có yêu cầu tại thời điểm thực thi ứng dụng, nhờ đó làm tăng hiệu suất của ứng dụng.
 * – Monitor Proxy: loại này sẽ thiết lập các bảo mật trên đối tượng cần bảo vệ, ngăn không cho client truy cập một số trường quan trọng của đối tượng.
 * – Protection Proxy: phạm vi truy cập của các client khác nhau sẽ khác nhau. Protection proxy sẽ kiểm tra các quyền truy cập của client khi có một dịch vụ được yêu cầu.
 * – Firewall Proxy: bảo vệ đối tượng từ chối các yêu cầu xuất xứ từ các client không tín nhiệm.
 * – Cache Proxy: cung cấp không gian lưu trữ tạm thời cho các kết quả trả về từ đối tượng nào đó, kết quả này sẽ được tái sử dụng cho các client chia sẻ chung một yêu cầu gửi đến.
 * – Smart Reference Proxy: là nơi kiểm soát các hoạt động bổ sung mỗi khi đối tượng được tham chiếu.
 * – Synchronization Proxy: đảm bảo nhiều client có thể truy cập vào cùng một đối tượng mà không gây ra xung đột.
 * Khi một client nào đó chiếm dụng khóa khá lâu khiến cho số lượng các client trong danh sách hàng đợi cứ tăng lên, và do đó hoạt động của hệ thống bị ngừng trệ, có thể dẫn đến hiện tượng “tắc nghẽn”.
 * – Copy-On-Write Proxy: loại này đảm bảo rằng sẽ không có client nào phải chờ vô thời hạn.
 * Copy-On-Write Proxy là một thiết kế rất phức tạp.
 */
public class Main {
    public static void main(String[] args) {
        ReadFileProxy readFileProxy = new ReadFileProxy("HoVanLy");
        System.out.println(readFileProxy.readFile());
        ReadFileProxy readFileProxy1 = new ReadFileProxy("HoVanLy_1");
        System.out.println(readFileProxy1.readFile());
    }
}
