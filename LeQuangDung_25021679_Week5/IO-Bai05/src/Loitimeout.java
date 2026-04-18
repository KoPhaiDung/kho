public class Loitimeout extends InvalidConfigException{
    public Loitimeout(){
        super("Loi thoi gian ko the < 0");
    }
    public Loitimeout(String mess){
        super(mess);
    }
}
