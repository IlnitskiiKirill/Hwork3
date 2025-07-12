//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.


         {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.

            System.out.println("Задача №1 ");

            byte a = 13;
             System.out.println(" Значение переменной a c типом byte = " +a);

             short b = 765;
             System.out.println(" Значение переменной b c типом short = " +b);

             int c = 23765;
             System.out.println(" Значение переменной c c типом int = " +c);

             long d = 854L;
             System.out.println(" Значение переменной d c типом long = " +d);

             float e = 2.43F;
             System.out.println(" Значение переменной e c типом float = " +e);

             double f = 34.8905;
             System.out.println(" Значение переменной f c типом double = " +f);

             System.out.println("Задача №2 ");

             float a1= 22.12F;
             System.out.println("Значение переменной a1= " + a1 + " тип переменой float");

             long a2 = 987678965549L;
             System.out.println("Значение переменной a2= " + a2 + " тип переменной long");

             float a3= 2.786F;
             System.out.println("Значение переменной a3= " + a3 + " тип переменной float");

             short a4= 569;
             System.out.println("Значение переменной a4= " + a4 + " тип переменной short");

             short a5= -159;
             System.out.println("Значение переменной a5= " + a5 + " тип переменной short");

             short a6= 27897;
             System.out.println("Значение переменной a6= " + a6 + " тип переменной short");

             byte a7 = 67;
             System.out.println("Значение переменной a7= " + a7 + " тип переменной byte");

             System.out.println("Задача №3 ");

             byte ludmilaPavlovna = 23;
             byte annaSergeevna = 27;
             byte ekaterinaAndreevna = 30;

             int allPaper= 480;

             int allChildren = ludmilaPavlovna+annaSergeevna+ekaterinaAndreevna;

             int paper = allPaper/allChildren;

             System.out.println("на каждого ученика расчитано " + paper + " листов бумаги");

             System.out.println("Задача №4 ");

             byte twoMin = 16;

             byte oneMin = 16/2;

             short twentyMin = 20;

             int mm20 = twentyMin*oneMin;
             System.out.println("За " + twentyMin + " минут машина сделала " + mm20 + " бутылок");

             byte oneHour = 60;

             byte days1 = 1;

             byte hoursInDay = 24;

             int oneDayTime = days1*hoursInDay*oneHour;

             int oneDay = oneDayTime*oneMin;

             System.out.println("За " + days1 + " сутки машина сделала " + oneDay + " бутылок");

             byte days3 = 3;

             int threeDayTime = days3*hoursInDay*oneHour;

             int threeDay = threeDayTime*oneMin;

             System.out.println("За " + days3 + " суток машина сделала " + threeDay + " бутылок");

             byte month = 1;

             byte daysInMonth = 31;

             int hoursInMonth = daysInMonth*hoursInDay;

             long minutesInMonth = hoursInMonth*oneHour;

             long onemon = minutesInMonth*oneMin;

             System.out.println("За " + month + " месяц машина сделала " + onemon + " бутылок");

             System.out.println("Задача №5 ");

             byte allBanks = 120;

             byte white = 2;

             byte grey = 4;

             int oneClassAllColor = grey + white;

             int allClasses = allBanks/oneClassAllColor;

             int whiteBanks = allClasses*white;

             int greyBanks = allClasses*grey;

             System.out.println("В школе где всего " + allClasses + " классов, нужно " + whiteBanks + " банок белой краски и " + greyBanks +  " банок коричневой краски");



             System.out.println("Задача №6 ");

             byte oneBanana = 80;
             byte oneMilk = 105;
             byte oneIceCream = 100;
             byte oneEgg = 70;

             short bananas = 5;
             short milk = 2;
             short iceCream = 2;
             short eggs = 4;

             int allBananas = oneBanana*bananas;
             int allMilk = oneMilk*milk;
             int allIceCream = oneIceCream*iceCream;
             int allEggs = eggs*oneEgg;

             int breakfast = allBananas+allMilk+allIceCream+allEggs;
             int kg = 1000;
             double kgBreakfast = breakfast/kg;

             System.out.println("Вес завтрака " + breakfast + " гр.");
             System.out.println("Вес завтрака " + kgBreakfast + " кг.");

             System.out.println("Задача №7 ");

byte need = 7;

short min = 250;
short max = 500;
short grammInKilo = 1000;
int needGramm = need*grammInKilo;

int daysMin = needGramm/min;
int daysMax = needGramm/max;
float onAverange = (min+max)/2;
float daysOnAverange = needGramm/onAverange;

             System.out.println("Если каждый день спортсмен будет скидывать по " + min + " гр. То для полного похудения на " + need + " кг. Понадобиться " + daysMin + " дней");
             System.out.println("Если каждый день спортсмен будет скидывать по " + max + " гр. То для полного похудения на " + need + " кг. Понадобиться " + daysMax + " дней");
             System.out.println("Если каждый день спортсмен будет скидывать в среднем по " + onAverange + " гр. То для полного похудения на " + need + " кг. в среднем понадобиться " + daysOnAverange + " дней");

             System.out.println("Задача №8 ");

             int mary = 67760;
             int denis = 83690;
             int kristina = 76230;

             float bonus = 0.1F;


             double maryBonus = mary*bonus;
             double denisBonus = denis*bonus;
             double kristinaBonus = kristina*bonus;

             double mary2 = mary+maryBonus;
             double denis2 = denis+denisBonus;
             double kristina2 = kristina+kristinaBonus;

             int montInYear = 12;

             int maryYear = montInYear*mary;
             int denisYear = montInYear*denis;
             int kristinaYear = montInYear*kristina;
             double maryYear2 = mary2*montInYear;
             double denisYear2 = denis2*montInYear;
             double kristinaYear2 = kristina2*montInYear;

             double diffmary = maryYear2-maryYear;
             double diffdenis = denisYear2-denisYear;
             double diffkristina = kristinaYear2-kristinaYear;

             System.out.println("Маша теперь получает " + mary2 + " руб. в месяц. Годовой доход увеличился на " + diffmary + " рублей ");
             System.out.println("Денис теперь получает " + denis2 + " руб. в месяц. Годовой доход увеличился на " + diffdenis+ " рублей ");
             System.out.println("Кристина теперь получает " + kristina2 + " руб. в месяц. Годовой доход увеличился на " + diffkristina+ " рублей ");










         }
    }
}