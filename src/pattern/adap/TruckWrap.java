package pattern.adap;

/**
 Сам адаптер.
 <p>
 Позволяет запихнуть {@link MyMAN} в {@link CarWash}.

 @since 28.04.2018 */
class TruckWrap implements Car1 {

    /**
     То, что надо "помыть".
     <p>
     Т.е. {@link MyMAN} в этом примере.
     */
    private final MyMAN myMAN;

    /**
     @param myMAN грузовик, который не влезает в {@link CarWash}
     */
    public TruckWrap(MyMAN myMAN) {
        this.myMAN = myMAN;
    }

    /**
     Адаптер должен имплементить нужный интерфейс.
     <p>
     В данном случае - интерфейс для мойки машин.
     И когда {@link MyMAN}, будет вызывать метод мойки,
     ему вернётся метод мойки грузовиков из адаптера.
     */
    @Override
    public void wash() {
        myMAN.cleanMe();
    }
}
