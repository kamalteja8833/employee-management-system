package in.kamal.employee_management.exceptions;

import java.time.LocalDateTime;

public class EmployeeManagementErrorResponse {
    private LocalDateTime time;
    private int status;
    private String message;

    public EmployeeManagementErrorResponse(LocalDateTime time, int status, String message) {
        this.time = time;
        this.status = status;
        this.message = message;
    }

    public EmployeeManagementErrorResponse(){

    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
