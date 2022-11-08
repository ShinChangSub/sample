package untitled.domain;

import untitled.domain.*;
import untitled.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class FileIdexed extends AbstractEvent {

    private Long id;

    public FileIdexed(Index aggregate){
        super(aggregate);
    }
    public FileIdexed(){
        super();
    }
}
