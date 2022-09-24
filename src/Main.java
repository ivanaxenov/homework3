public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int apple = 15;
        System.out.println(apple);
        System.out.println("Значеник переменной apple с типом int равно 15 ");
        byte fish = 10;
        System.out.println(fish);
        System.out.println(" Значение переменной fish с типом byte равно 10 ");
        short grape = 3500;
        System.out.println(grape);
        System.out.println(" Значение переменной grape с типом short равно 3500");
        long example = 2345672;
        System.out.println(example);
        System.out.println(" Значение переменной example с типом long равно 2345672");
        float pineapple = 2f;
        System.out.println(pineapple);
        System.out.println(" Значение переменной pineapple с типом float равно 2f ");
        double pen = 1.5;
        System.out.println(pen);
        System.out.println(" Значение пременной pen с типом double равно 1.5 ");
        System.out.println("Задание 2");
        int a = 569;
        System.out.println(a);
        byte b = 67;
        System.out.println(b);
        float c = 27.12f;
        System.out.println(c);
        short d = 27897;
        System.out.println(d);
        long e = 987678965549L;
        System.out.println(e);
        int f = -159;
        System.out.println(f);
        double g = 2.786;
        System.out.println(g);
        boolean h = false;
        System.out.println(h);
        System.out.println(" Задание 3 ");
        byte lyudmilaPavlovna = 23;
        byte annaSergeyevna = 27;
        byte yekaterinaAndreyevna = 30;
        short totalPaper = 480;
        int allCount = lyudmilaPavlovna + annaSergeyevna + yekaterinaAndreyevna; // общее кол-во учеников
        int numberPapper = totalPaper / allCount;
        System.out.println("На каждого ученика рассчитано " + numberPapper + " листов бумаги");
        System.out.println(" Задание 4 ");
        byte bottle = 16;
        System.out.println("Производительность бутылок " + bottle);
        byte time = 2;
        System.out.println("Время на производительность бутылок " + time + " мин");
        byte oneDay = 24; // в одном дне 24 часа
        byte bottleInMinute = 16 / 2; // 8 бутылок в минуту
        int secondTime = bottleInMinute * 20; // за 20 минут
        System.out.println("За 20 минут машина призвела бутылок " + secondTime + " шт");
        int inHour = bottleInMinute * 60; // производительность в час
        long day = oneDay * inHour;
        System.out.println("За 24 часа машина произвела бутылок " + day + " шт");
        int threeDay = oneDay * 3;
        int threeDayBo = threeDay * inHour;
        System.out.println("За 3 дня машина произвела бутылок " + threeDayBo + " шт");
        int oneMonth = 720 * inHour;
        System.out.println("За 1 месяц машина произвела бутылок " + oneMonth + " шт");
        System.out.println("Задание 5");
        byte whitePait = 2;
        byte brownPaint = 4;
        byte allPaint = 120;
        int amountPaint = whitePait + brownPaint;//краски на 1 класс
        int amountClass = allPaint / amountPaint;//20 классов
        System.out.println("В школе где " + amountClass + " классов, нужно " + amountClass * 2 + " белой краски и " + amountClass * 4 + " коричневой краски");
        System.out.println("Задание 6");
        byte bananasAmount = 5;
        int bananasWeight = 80 * bananasAmount;
        double milkAmount = 200;
        double milkWeight = milkAmount / 105;
        byte icecreamAmount = 2;
        int icecreamWeight = 100 * icecreamAmount;
        int eggAmount = 4;
        int eggWeight = eggAmount * 70;
        double totalWeight = bananasWeight + milkWeight + icecreamWeight + eggWeight;
        float weightKg = (float) (totalWeight / 1000);
        System.out.println("Вес завтрака составляет " + weightKg + " килограмм ");
        System.out.println("Задание 7");
        byte target = 7;
        double inDay250 = 250.0 / 1000;
        double inDay500 = 500.0 / 1000;
        double numDay250 = target / inDay250;
        int nD250 = (int) numDay250;
        double numDay500 = target / inDay500;
        int nD500 = (int) numDay500;
        int mean = (nD250 + nD500) / 2;
        System.out.println("Если спорстмен будет терять каждый день по 250 грамм, то похудеет за "
                + nD250 + " дней");
        System.out.println("Если спортсмен будет терять каждый день по 500 грамм, то похудеет за "
                + nD500 + " дней");
        System.out.println("В среднем потребуется " + mean + " дней для похудения ");
        System.out.println("Задание 8");
        double mashaBefore = 67760.0;
        double denisBefore = 83690.0;
        double kristinaBefore = 76230;
        double mashaAfter = mashaBefore + (mashaBefore * 0.1);
        double denisAfter = denisBefore + (denisBefore * 0.1);
        double kristinaAfter = kristinaBefore + (kristinaBefore * 0.1);
        double mashaInYerBefore = mashaBefore * 12;
        double denisInYerBefore = denisBefore * 12;
        double kristinaInYerBefore = kristinaBefore * 12;
        double mashaInYerAfter = mashaAfter * 12;
        double denisInYerAfter = denisAfter * 12;
        double kristinaInYerAfter = kristinaAfter * 12;
        double meanMasha = mashaInYerAfter - mashaInYerBefore;
        double meanDenis = denisInYerAfter - denisInYerBefore;
        double meanKristina = kristinaInYerAfter - kristinaInYerBefore;
        System.out.println("Маша теперь получает " + mashaAfter + " рублей. Годовой доход вырос на "
                + meanMasha + " рублей");
        System.out.println("Денис теперь получает " + denisAfter + " рублей. Годовой доход вырос на "
                + meanDenis + " рублей");
        System.out.println("Кристина теперь получает " + kristinaAfter + " рублей. Годовой доход вырос на "
                + meanKristina + " рублей");


    }
}