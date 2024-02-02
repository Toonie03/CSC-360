
public class UnderAgeException extends Exception
{

	/**
	 * 
	 */
	public UnderAgeException()
	{
		super("Parents are too young");
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 */
	public UnderAgeException(String message)
	{
		super(message);
	}

	private static final long serialVersionUID = 4387563130738037824L;
	
}
