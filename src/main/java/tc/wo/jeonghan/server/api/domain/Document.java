package tc.wo.jeonghan.server.api.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
@AllArgsConstructor
public class Document {
    private int id;
    private String title;
    private String text;
    private LocalDateTime dateTime;

}
