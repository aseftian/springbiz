package aseftian.springbiz.config;

import java.util.Optional;

import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.exception.ExceptionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import aseftian.springbiz.exception.FilterException;
import aseftian.springbiz.model.response.ResponseModel;

@ControllerAdvice
public class WebAdvice {

	private final Logger LOG = LoggerFactory.getLogger(WebAdvice.class);

	@ExceptionHandler({ Exception.class, RuntimeException.class })
	public @ResponseBody ResponseEntity<ResponseModel> handleExceptions(Exception e, HttpServletResponse res) {
		e = (Exception) Optional.ofNullable(ExceptionUtils.getRootCause(e)).orElse(e);

		ResponseModel model = ResponseModel.error(500, "Terjadi kesalahan, silahkan coba beberapa saat lagi",
				e.getMessage());
		if (e instanceof FilterException) {
			LOG.error("Exception: {}", e.getMessage());
			model = ResponseModel.error(400, e.getMessage());
		} else if (e instanceof IllegalArgumentException) {
			LOG.error("Exception: {}", e.getMessage());
			model = ResponseModel.error(412, e.getMessage());
		} else {
			LOG.error("Exception: {}", e);
		}

		return ResponseEntity.ok(model);
	}

}
