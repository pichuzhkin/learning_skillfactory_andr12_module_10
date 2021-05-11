public class UglyNumber {
    private final String res;
    public UglyNumber(String input) throws TooPrettyNumberException
    {
        // парсим входную строку (это важно!) в число
        res = Integer.toString(Integer.parseInt(input));
        // если число, переведенное в строку, состоит из одних и тех же символов - выбросить исключение
        if (res.chars().distinct().toArray().length == 1) throw new TooPrettyNumberException(res);

    }

    @Override public String toString()
    {
        return res;
    }
}
