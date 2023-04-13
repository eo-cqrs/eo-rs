package io.github.eocqrs.rs.json;

import io.github.eocqrs.rs.RsError;

/**
 * Json Error.
 *
 * @author Aliaksei Bialiauski (abialiauski.dev@gmail.com)
 * @since 0.0.0
 */
public final class JsonError implements RsError {

  /**
   * Json message.
   */
  private final String message;

  /**
   * Primary Ctor.
   *
   * @param msg The message
   */
  public JsonError(final String msg) {
    this.message = msg;
  }

  public JsonError(final RsError err) {
    this(err.content());
  }

  @Override
  public String content() {
    return """
      {
      "message" : "%s" 
      }
      """
      .formatted(
        this.message
      );
  }
}
