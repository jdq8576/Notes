package designpattern.adapter;

/**
 * @author tim
 * @date 2022/11/8 15:02
 */
public class AdapterPattern {
    public static void main(String[] args) {

    }
}

class Speaker {
    public String speak() {
        return "China No.1";
    }
}

interface Translator {
    public String translate();
}

class Adapter implements Translator {

    private Speaker speaker;

    public Adapter(Speaker speaker) {
        this.speaker = speaker;
    }

    @Override
    public String translate() {
        final String result = speaker.speak();
        // 理解 手语
        return result;
    }
}
