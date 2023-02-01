public class Copy {
    public void execute(Inputinfo _input){
        Inputinfo input = _input;
        OutputConsole output = new OutputConsole();

        for(int i=0 ; i<20;i++){
            char c = input.readCharFromFile();
            input.dummy();
            output.WriteChar(c);
        }
    }

    public static void main(String args[]) {
        new Copy().execute(new InputFile());
    }
}
