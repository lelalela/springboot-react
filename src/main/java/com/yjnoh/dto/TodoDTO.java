package com.yjnoh.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class TodoDTO {

    private String id;

    private String title;

    private boolean done;

    public TodoDTO(final TodoEntity todoEntity) {
        this.id = todoEntity.getId();
        this.title = todoEntity.getTitle();
        this.done = todoEntity.isDone();
    }


}
