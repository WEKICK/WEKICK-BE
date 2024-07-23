package server.wekick.common.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import server.wekick.common.exception.dto.ErrorResponseDTO;

@Getter
@AllArgsConstructor
public class GeneralException extends RuntimeException {

    private final BaseErrorCode errorCode;

    public ErrorResponseDTO getErrorReason() {
        return this.errorCode.getReason();
    }

    public ErrorResponseDTO getErrorReasonHttpStatus() {
        return this.errorCode.getReasonHttpStatus();
    }
}
