
package co.develhope.websocket2.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class MessageDTO {

    private String sender;
    private String type;
    private String message;


}