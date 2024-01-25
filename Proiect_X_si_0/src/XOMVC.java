public class XOMVC {
    public static void main(String[] args) {
        XOModel model = new XOModel();
        XOView view = new XOView(model);
        XOController controller = new XOController(view,model);
        view.setVisible(true);
    }
}
