package pattern.absfact;

/**
 Использование {@link TankFactory} классом {@link TankBoss}
 <p>
 Запрос в {@link TankFactory}, где мы просим {@link Tank} <tt>toyota</tt> и <tt>audi</tt>,
 Классы {@link TankFactory.T52} {@link TankFactory.T60}, переопределяют метод {@link Tank#drive()}.
 На выходе в этом классе, имеем "максимальную скорость" по-марке.
 <a href='https://youtu.be/A4uNotdECBg'>YouTube</a>
 */
public class TankBoss {
    /**
     Владелец такновой фабрики

     @param args null

     @see MasterOfPuppets
     @see TankFactory
     */
    public static void main(String[] args) {
        System.out.println("SEE GARAGE");
    }
}

