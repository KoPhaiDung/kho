public class maxconectionexp extends InvalidConfigException {
    public maxconectionexp(String message) {
        super(message);
    }
    public maxconectionexp(){
        super("loi maxConnection chi co the la so nguyen va >= 0");
    }
}
