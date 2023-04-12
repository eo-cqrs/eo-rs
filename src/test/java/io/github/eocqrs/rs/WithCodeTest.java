package io.github.eocqrs.rs;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

/**
 * Test case for {@link io.github.eocqrs.rs.RsError.WithCode}.
 *
 * @author Aliaksei Bialiauski (abialiauski.dev@gmail.com)
 * @since 0.0.0
 */
final class WithCodeTest {

  @Test
  void readsContent() {
    final RsError error = new RsError.WithCode(
      "User is not found", 404
    );
    MatcherAssert.assertThat(
      "Reads content right",
      error.content(),
      Matchers.equalTo("Error code: 404, Message content: User is not found")
    );
  }
}
