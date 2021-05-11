public class TooPrettyNumberException extends IllegalArgumentException {
  TooPrettyNumberException(String whichNumber)
  {
      super("This number is too pretty to be in this class - "+whichNumber);
  }
}
