public class Loinhapvao extends InvalidConfigException {
    public Loinhapvao(String message) {
        super(message);
    }
    public Loinhapvao(){
        super("dau vao phai co dang 'key'='value'");
    }
}
