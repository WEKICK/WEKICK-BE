package server.wekick.common.exception;


import server.wekick.common.exception.dto.ErrorResponseDTO;

public interface BaseErrorCode {

    public ErrorResponseDTO getReason();

    public ErrorResponseDTO getReasonHttpStatus();
}
