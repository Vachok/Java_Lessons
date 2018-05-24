package pattern.frontcont;

/**
 * Принимает и обрабатывает запросы от {@link FrontMain}
 *
 * @author IKudryashov
 * @since 23.05.2018 (16:17)
 */
class DispatcherServlet {

    /**
     * @param url введённый в {@link FrontMain} {@code url}.
     */
    public void process(String url) {
        switch (url) {
            case "home":
                new HomeControl().show();
                break;
            case "user":
                new UserControl().show();
                break;
            default:
                new DefControl().show();
        }
    }
}
