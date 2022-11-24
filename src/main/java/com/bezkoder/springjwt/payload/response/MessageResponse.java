package com.bezkoder.springjwt.payload.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.bytebuddy.asm.Advice;
import net.bytebuddy.implementation.bind.annotation.AllArguments;

import javax.annotation.sql.DataSourceDefinition;
import javax.persistence.Entity;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MessageResponse {
  private String message;

  /*public MessageResponse(String message) {
    this.message = message;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }*/
}
