// Autogenerated code. Do not modify.
package com.chaos.cupid.client;

import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Joiner;
import com.google.common.base.Preconditions;
import java.util.EnumSet;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;
import javax.annotation.Generated;

/**
 * Auto-generated superclass of {@link Psyche.Builder},
 * derived from the API of {@link Psyche}.
 */
@Generated("org.inferred.freebuilder.processor.CodeGenerator")
public abstract class Psyche_Builder {

  /**
   * Creates a new builder using {@code value} as a template.
   */
  public static Psyche.Builder from(Psyche value) {
    return new Psyche.Builder().mergeFrom(value);
  }

  private static final Joiner COMMA_JOINER = Joiner.on(", ").skipNulls();

  private enum Property {
    HOST("host"),
    PORT("port"),
    UNIQUE_ID("uniqueId"),
    CONSUMER("consumer"),
    ;

    private final String name;

    private Property(String name) {
      this.name = name;
    }

    @Override
    public String toString() {
      return name;
    }
  }

  private String host;
  private Integer port;
  private String uniqueId;
  private Consumer<String> consumer;
  private final EnumSet<Psyche_Builder.Property> _unsetProperties =
      EnumSet.allOf(Psyche_Builder.Property.class);

  /**
   * Sets the value to be returned by {@link Psyche#getHost()}.
   *
   * @return this {@code Builder} object
   * @throws NullPointerException if {@code host} is null
   */
  public Psyche.Builder setHost(String host) {
    this.host = Preconditions.checkNotNull(host);
    _unsetProperties.remove(Psyche_Builder.Property.HOST);
    return (Psyche.Builder) this;
  }

  /**
   * Replaces the value to be returned by {@link Psyche#getHost()}
   * by applying {@code mapper} to it and using the result.
   *
   * @return this {@code Builder} object
   * @throws NullPointerException if {@code mapper} is null or returns null
   * @throws IllegalStateException if the field has not been set
   */
  public Psyche.Builder mapHost(UnaryOperator<String> mapper) {
    Preconditions.checkNotNull(mapper);
    return setHost(mapper.apply(getHost()));
  }

  /**
   * Returns the value that will be returned by {@link Psyche#getHost()}.
   *
   * @throws IllegalStateException if the field has not been set
   */
  public String getHost() {
    Preconditions.checkState(
        !_unsetProperties.contains(Psyche_Builder.Property.HOST), "host not set");
    return host;
  }

  /**
   * Sets the value to be returned by {@link Psyche#getPort()}.
   *
   * @return this {@code Builder} object
   * @throws NullPointerException if {@code port} is null
   */
  public Psyche.Builder setPort(Integer port) {
    this.port = Preconditions.checkNotNull(port);
    _unsetProperties.remove(Psyche_Builder.Property.PORT);
    return (Psyche.Builder) this;
  }

  /**
   * Replaces the value to be returned by {@link Psyche#getPort()}
   * by applying {@code mapper} to it and using the result.
   *
   * @return this {@code Builder} object
   * @throws NullPointerException if {@code mapper} is null or returns null
   * @throws IllegalStateException if the field has not been set
   */
  public Psyche.Builder mapPort(UnaryOperator<Integer> mapper) {
    Preconditions.checkNotNull(mapper);
    return setPort(mapper.apply(getPort()));
  }

  /**
   * Returns the value that will be returned by {@link Psyche#getPort()}.
   *
   * @throws IllegalStateException if the field has not been set
   */
  public Integer getPort() {
    Preconditions.checkState(
        !_unsetProperties.contains(Psyche_Builder.Property.PORT), "port not set");
    return port;
  }

  /**
   * Sets the value to be returned by {@link Psyche#getUniqueId()}.
   *
   * @return this {@code Builder} object
   * @throws NullPointerException if {@code uniqueId} is null
   */
  public Psyche.Builder setUniqueId(String uniqueId) {
    this.uniqueId = Preconditions.checkNotNull(uniqueId);
    _unsetProperties.remove(Psyche_Builder.Property.UNIQUE_ID);
    return (Psyche.Builder) this;
  }

  /**
   * Replaces the value to be returned by {@link Psyche#getUniqueId()}
   * by applying {@code mapper} to it and using the result.
   *
   * @return this {@code Builder} object
   * @throws NullPointerException if {@code mapper} is null or returns null
   * @throws IllegalStateException if the field has not been set
   */
  public Psyche.Builder mapUniqueId(UnaryOperator<String> mapper) {
    Preconditions.checkNotNull(mapper);
    return setUniqueId(mapper.apply(getUniqueId()));
  }

  /**
   * Returns the value that will be returned by {@link Psyche#getUniqueId()}.
   *
   * @throws IllegalStateException if the field has not been set
   */
  public String getUniqueId() {
    Preconditions.checkState(
        !_unsetProperties.contains(Psyche_Builder.Property.UNIQUE_ID), "uniqueId not set");
    return uniqueId;
  }

  /**
   * Sets the value to be returned by {@link Psyche#getConsumer()}.
   *
   * @return this {@code Builder} object
   * @throws NullPointerException if {@code consumer} is null
   */
  public Psyche.Builder setConsumer(Consumer<String> consumer) {
    this.consumer = Preconditions.checkNotNull(consumer);
    _unsetProperties.remove(Psyche_Builder.Property.CONSUMER);
    return (Psyche.Builder) this;
  }

  /**
   * Replaces the value to be returned by {@link Psyche#getConsumer()}
   * by applying {@code mapper} to it and using the result.
   *
   * @return this {@code Builder} object
   * @throws NullPointerException if {@code mapper} is null or returns null
   * @throws IllegalStateException if the field has not been set
   */
  public Psyche.Builder mapConsumer(UnaryOperator<Consumer<String>> mapper) {
    Preconditions.checkNotNull(mapper);
    return setConsumer(mapper.apply(getConsumer()));
  }

  /**
   * Returns the value that will be returned by {@link Psyche#getConsumer()}.
   *
   * @throws IllegalStateException if the field has not been set
   */
  public Consumer<String> getConsumer() {
    Preconditions.checkState(
        !_unsetProperties.contains(Psyche_Builder.Property.CONSUMER), "consumer not set");
    return consumer;
  }

  /**
   * Sets all property values using the given {@code Psyche} as a template.
   */
  public Psyche.Builder mergeFrom(Psyche value) {
    Psyche_Builder _defaults = new Psyche.Builder();
    if (_defaults._unsetProperties.contains(Psyche_Builder.Property.HOST)
        || !value.getHost().equals(_defaults.getHost())) {
      setHost(value.getHost());
    }
    if (_defaults._unsetProperties.contains(Psyche_Builder.Property.PORT)
        || !value.getPort().equals(_defaults.getPort())) {
      setPort(value.getPort());
    }
    if (_defaults._unsetProperties.contains(Psyche_Builder.Property.UNIQUE_ID)
        || !value.getUniqueId().equals(_defaults.getUniqueId())) {
      setUniqueId(value.getUniqueId());
    }
    if (_defaults._unsetProperties.contains(Psyche_Builder.Property.CONSUMER)
        || !value.getConsumer().equals(_defaults.getConsumer())) {
      setConsumer(value.getConsumer());
    }
    return (Psyche.Builder) this;
  }

  /**
   * Copies values from the given {@code Builder}.
   * Does not affect any properties not set on the input.
   */
  public Psyche.Builder mergeFrom(Psyche.Builder template) {
    // Upcast to access private fields; otherwise, oddly, we get an access violation.
    Psyche_Builder base = (Psyche_Builder) template;
    Psyche_Builder _defaults = new Psyche.Builder();
    if (!base._unsetProperties.contains(Psyche_Builder.Property.HOST)
        && (_defaults._unsetProperties.contains(Psyche_Builder.Property.HOST)
            || !template.getHost().equals(_defaults.getHost()))) {
      setHost(template.getHost());
    }
    if (!base._unsetProperties.contains(Psyche_Builder.Property.PORT)
        && (_defaults._unsetProperties.contains(Psyche_Builder.Property.PORT)
            || !template.getPort().equals(_defaults.getPort()))) {
      setPort(template.getPort());
    }
    if (!base._unsetProperties.contains(Psyche_Builder.Property.UNIQUE_ID)
        && (_defaults._unsetProperties.contains(Psyche_Builder.Property.UNIQUE_ID)
            || !template.getUniqueId().equals(_defaults.getUniqueId()))) {
      setUniqueId(template.getUniqueId());
    }
    if (!base._unsetProperties.contains(Psyche_Builder.Property.CONSUMER)
        && (_defaults._unsetProperties.contains(Psyche_Builder.Property.CONSUMER)
            || !template.getConsumer().equals(_defaults.getConsumer()))) {
      setConsumer(template.getConsumer());
    }
    return (Psyche.Builder) this;
  }

  /**
   * Resets the state of this builder.
   */
  public Psyche.Builder clear() {
    Psyche_Builder _defaults = new Psyche.Builder();
    host = _defaults.host;
    port = _defaults.port;
    uniqueId = _defaults.uniqueId;
    consumer = _defaults.consumer;
    _unsetProperties.clear();
    _unsetProperties.addAll(_defaults._unsetProperties);
    return (Psyche.Builder) this;
  }

  /**
   * Returns a newly-created {@link Psyche} based on the contents of the {@code Builder}.
   *
   * @throws IllegalStateException if any field has not been set
   */
  public Psyche build() {
    Preconditions.checkState(_unsetProperties.isEmpty(), "Not set: %s", _unsetProperties);
    return new Psyche_Builder.Value(this);
  }

  /**
   * Returns a newly-created partial {@link Psyche}
   * based on the contents of the {@code Builder}.
   * State checking will not be performed.
   * Unset properties will throw an {@link UnsupportedOperationException}
   * when accessed via the partial object.
   *
   * <p>Partials should only ever be used in tests.
   */
  @VisibleForTesting()
  public Psyche buildPartial() {
    return new Psyche_Builder.Partial(this);
  }

  private static final class Value implements Psyche {
    private final String host;
    private final Integer port;
    private final String uniqueId;
    private final Consumer<String> consumer;

    private Value(Psyche_Builder builder) {
      this.host = builder.host;
      this.port = builder.port;
      this.uniqueId = builder.uniqueId;
      this.consumer = builder.consumer;
    }

    @Override
    public String getHost() {
      return host;
    }

    @Override
    public Integer getPort() {
      return port;
    }

    @Override
    public String getUniqueId() {
      return uniqueId;
    }

    @Override
    public Consumer<String> getConsumer() {
      return consumer;
    }

    @Override
    public boolean equals(Object obj) {
      if (!(obj instanceof Psyche_Builder.Value)) {
        return false;
      }
      Psyche_Builder.Value other = (Psyche_Builder.Value) obj;
      return Objects.equals(host, other.host)
          && Objects.equals(port, other.port)
          && Objects.equals(uniqueId, other.uniqueId)
          && Objects.equals(consumer, other.consumer);
    }

    @Override
    public int hashCode() {
      return Objects.hash(host, port, uniqueId, consumer);
    }

    @Override
    public String toString() {
      return "Psyche{"
          + "host="
          + host
          + ", "
          + "port="
          + port
          + ", "
          + "uniqueId="
          + uniqueId
          + ", "
          + "consumer="
          + consumer
          + "}";
    }
  }

  private static final class Partial implements Psyche {
    private final String host;
    private final Integer port;
    private final String uniqueId;
    private final Consumer<String> consumer;
    private final EnumSet<Psyche_Builder.Property> _unsetProperties;

    Partial(Psyche_Builder builder) {
      this.host = builder.host;
      this.port = builder.port;
      this.uniqueId = builder.uniqueId;
      this.consumer = builder.consumer;
      this._unsetProperties = builder._unsetProperties.clone();
    }

    @Override
    public String getHost() {
      if (_unsetProperties.contains(Psyche_Builder.Property.HOST)) {
        throw new UnsupportedOperationException("host not set");
      }
      return host;
    }

    @Override
    public Integer getPort() {
      if (_unsetProperties.contains(Psyche_Builder.Property.PORT)) {
        throw new UnsupportedOperationException("port not set");
      }
      return port;
    }

    @Override
    public String getUniqueId() {
      if (_unsetProperties.contains(Psyche_Builder.Property.UNIQUE_ID)) {
        throw new UnsupportedOperationException("uniqueId not set");
      }
      return uniqueId;
    }

    @Override
    public Consumer<String> getConsumer() {
      if (_unsetProperties.contains(Psyche_Builder.Property.CONSUMER)) {
        throw new UnsupportedOperationException("consumer not set");
      }
      return consumer;
    }

    @Override
    public boolean equals(Object obj) {
      if (!(obj instanceof Psyche_Builder.Partial)) {
        return false;
      }
      Psyche_Builder.Partial other = (Psyche_Builder.Partial) obj;
      return Objects.equals(host, other.host)
          && Objects.equals(port, other.port)
          && Objects.equals(uniqueId, other.uniqueId)
          && Objects.equals(consumer, other.consumer)
          && Objects.equals(_unsetProperties, other._unsetProperties);
    }

    @Override
    public int hashCode() {
      return Objects.hash(host, port, uniqueId, consumer, _unsetProperties);
    }

    @Override
    public String toString() {
      return "partial Psyche{"
          + COMMA_JOINER.join(
              (!_unsetProperties.contains(Psyche_Builder.Property.HOST) ? "host=" + host : null),
              (!_unsetProperties.contains(Psyche_Builder.Property.PORT) ? "port=" + port : null),
              (!_unsetProperties.contains(Psyche_Builder.Property.UNIQUE_ID)
                  ? "uniqueId=" + uniqueId
                  : null),
              (!_unsetProperties.contains(Psyche_Builder.Property.CONSUMER)
                  ? "consumer=" + consumer
                  : null))
          + "}";
    }
  }
}
