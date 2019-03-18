package aseftian.springbiz.exception;

/**
 * Created by PRAGMA on 31/10/2017.
 */
public class FilterException extends RuntimeException {
	private static final long serialVersionUID = 3768269755582291968L;

	public FilterException() {
	}

	public FilterException(String message) {
		super(message);
	}

	public FilterException(String message, Throwable cause) {
		super(message, cause);
	}

	public FilterException(Throwable cause) {
		super(cause);
	}

	public FilterException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("FilterException [");
		builder.append("]");
		return builder.toString();
	}
}
