package aseftian.springbiz.model.response;

import java.io.Serializable;
import java.util.Optional;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import aseftian.springbiz.util.Check;

public class ResponseModel<T> implements Serializable {

	public static final int OK_CODE = 200;
	public static final int OK_CREATED_CODE = 201;
	public static final int ERROR_CODE_REQUEST = 400;
	public static final int ERROR_CODE_SERVER = 500;

	public static final String SUCCESS = "success";
	public static final String ERROR = "error";

	private int status;
	private T data;
	private String message;

	public ResponseModel() {
	}

	public ResponseModel(@Nullable T data) {
		this(OK_CODE, SUCCESS, data);
	}

	public ResponseModel(int status, String message, T data) {
		this.status = status;
		this.message = message;
		this.data = data;
	}

	public static <T> ResponseModel<T> ok(@Nullable T data) {
		return new ResponseModel(OK_CODE, "Success", data);
	}

	public static <T> ResponseModel<T> ok(@Nullable T data, String message) {
		return new ResponseModel(OK_CODE, message, data);
	}

	public static <T> ResponseModel<T> error(@Nonnull String message) {
		return error(ERROR_CODE_SERVER, message, null);
	}

	public static <T> ResponseModel<T> error(@Nonnull Integer status, @Nonnull String message) {
		return error(status, message, null);
	}

	public static <T> ResponseModel<T> error(@Nonnull Integer status, @Nonnull String message, @Nullable T data) {
		Check.hasText(message, "message required !");
		return new ResponseModel<>(status, message, data);
	}

	public int getStatus() {
		return status;
	}

	public ResponseModel<T> setStatus(int status) {
		this.status = status;
		return this;
	}

	public T getData() {
		return data;
	}

	public ResponseModel<T> setData(T data) {
		this.data = data;
		return this;
	}

	public String getMessage() {
		return message;
	}

	public ResponseModel<T> setMessage(String message) {
		this.message = message;
		return this;
	}

	public Optional<T> optionalData() {
		return Optional.ofNullable(data);
	}

	public boolean isSuccess() {
		return this.status == OK_CODE || this.status == OK_CREATED_CODE;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ResponseModel [");
		builder.append("status=");
		builder.append(status);
		builder.append(", data=");
		builder.append(data);
		builder.append(", message=");
		builder.append(message);
		builder.append("]");
		return builder.toString();
	}
}
