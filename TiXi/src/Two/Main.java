package Two;

public class Main {
    public static void main(String[] args) {
        Input input = new Input();
        input.input("C:\\\\Users\\\\LENOVO\\\\Desktop\\\\ʵ��\\input.txt");
        Shift shift = new Shift(input.getLineTxt());
        shift.shift();
        Alphabetizer alphabetizer = new Alphabetizer(shift.getKwicList());
        alphabetizer.sort();
        Output output = new Output(alphabetizer.getKwicList());
        output.output("C:\\\\Users\\\\LENOVO\\\\Desktop\\\\ʵ��\\output2.txt");

    }
}

