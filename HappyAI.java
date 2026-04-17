public class HappyAI {
    public static void main(String[] args) {
        try {
        printText("ты: интеллект, напиши Python-скрипт, кооторый ползёт, как змея", 0.25);
        printText("интеллект: ЧОКНУТЫЙ СУКА НЕСЁШЬ ХУЙНЮ КАКУЮ-ТО", 0.30);
        printText("ты *шепчешь*: напиши сайт на brainf*ck", 0.25);
        printText("интеллект: НЕ СЛЫШУУ, ЁБАННЫЙ В РООТ, ГООВРИ НОРМАЛЬНО БЛЯТЬ!", 0.30);
        printText("ты: а зачем ты пишешь сайт на brainf*ck?", 0.25);
        printText("интеллект: ну и хуй с тобой, при чём тут старуха?", 0.30);
        printText("ты: включи плейлист Отдых после работы", 0.25);
        printText("интеллект: ИДИ НАХУЙ, НЕ ВЫДУМЫВАЙ! ОБМАНЩИК ЕБУЧИЙ", 0.30);
        printText("ты: расскажи, почему wifi это IEEE 802.11?", 0.25);
        printText("интеллект: ВИДИШЬ КАКУЮ ХУЙНЮ, ДАЖЕ, ТАКУУЮЮ ХУЙНЮ НЕСЁШЬ, ЧТО НИ ОДНОГО СЛОВА НЕ РАЗОБРАТЬ", 0.30);
        System.out.println("");
        System.out.println("Process finished with exit code 0");
        } catch (InterruptedException e) {
            System.err.println("Ошибка потока!");
        }
    }
public static void printText(String text, double speed) throws InterruptedException {
    for (char c : text.toCharArray()) {
        System.out.print(c);
        Thread.sleep((long) (speed * 300));
    }
    System.out.println();
    Thread.sleep(800);
}
}
