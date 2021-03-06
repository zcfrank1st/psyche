// Autogenerated code. Do not modify.
package com.chaos.cupid.client;

import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Joiner;
import com.google.common.base.Preconditions;
import java.util.EnumSet;
import java.util.Objects;
import javax.annotation.Generated;

/**
 * Auto-generated superclass of {@link PsycheV2.Builder},
 * derived from the API of {@link PsycheV2}.
 */
@Generated("org.inferred.freebuilder.processor.CodeGenerator")
abstract class PsycheV2_Builder {

  /**
   * Creates a new builder using {@code value} as a template.
   */
  public static PsycheV2.Builder from(PsycheV2 value) {
    return new PsycheV2.Builder().mergeFrom(value);
  }

  private static final Joiner COMMA_JOINER = Joiner.on(", ").skipNulls();

  private enum Property {
    HOST("host"),
    PORT("port"),
    UNIQUE_ID("uniqueId"),
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
  private final EnumSet<PsycheV2_Builder.Property> _unsetProperties =
      EnumSet.allOf(PsycheV2_Builder.Property.class);

  /**
   * Sets the value to be returned by {@link PsycheV2#getHost()}.
   *
   * @return this {@code Builder} object
   * @throws NullPointerException if {@code host} is null
   */
  public PsycheV2.Builder setHost(String host) {
    this.host = Preconditions.checkNotNull(host);
    _unsetProperties.remove(PsycheV2_Builder.Property.HOST);
    return (PsycheV2.Builder) this;
  }

  /**
   * Returns the value that will be returned by {@link PsycheV2#getHost()}.
   *
   * @throws IllegalStateException if the field has not been set
   */
  public String getHost() {
    Preconditions.checkState(
        !_unsetProperties.contains(PsycheV2_Builder.Property.HOST), "host not set");
    return host;
  }

  /**
   * Sets the value to be returned by {@link PsycheV2#getPort()}.
   *
   * @return this {@code Builder} object
   * @throws NullPointerException if {@code port} is null
   */
  public PsycheV2.Builder setPort(Integer port) {
    this.port = Preconditions.checkNotNull(port);
    _unsetProperties.remove(PsycheV2_Builder.Property.PORT);
    return (PsycheV2.Builder) this;
  }

  /**
   * Returns the value that will be returned by {@link PsycheV2#getPort()}.
   *
   * @throws IllegalStateException if the field has not been set
   */
  public Integer getPort() {
    Preconditions.checkState(
        !_unsetProperties.contains(PsycheV2_Builder.Property.PORT), "port not set");
    return port;
  }

  /**
   * Sets the value to be returned by {@link PsycheV2#getUniqueId()}.
   *
   * @return this {@code Builder} object
   * @throws NullPointerException if {@code uniqueId} is null
   */
  public PsycheV2.Builder setUniqueId(String uniqueId) {
    this.uniqueId = Preconditions.checkNotNull(uniqueId);
    _unsetProperties.remove(PsycheV2_Builder.Property.UNIQUE_ID);
    return (PsycheV2.Builder) this;
  }

  /**
   * Returns the value that will be returned by {@link PsycheV2#getUniqueId()}.
   *
   * @throws IllegalStateException if the field has not been set
   */
  public String getUniqueId() {
    Preconditions.checkState(
        !_unsetProperties.contains(PsycheV2_Builder.Property.UNIQUE_ID), "uniqueId not set");
    return uniqueId;
  }

  /**
   * Sets all property values using the given {@code PsycheV2} as a template.
   */
  public PsycheV2.Builder mergeFrom(PsycheV2 value) {
    PsycheV2_Builder _defaults = new PsycheV2.Builder();
    if (_defaults._unsetProperties.contains(PsycheV2_Builder.Property.HOST)
        || !value.getHost().equals(_defaults.getHost())) {
      setHost(value.getHost());
    }
    if (_defaults._unsetProperties.contains(PsycheV2_Builder.Property.PORT)
        || !value.getPort().equals(_defaults.getPort())) {
      setPort(value.getPort());
    }
    if (_defaults._unsetProperties.contains(PsycheV2_Builder.Property.UNIQUE_ID)
        || !value.getUniqueId().equals(_defaults.getUniqueId())) {
      setUniqueId(value.getUniqueId());
    }
    return (PsycheV2.Builder) this;
  }

  /**
   * Copies values from the given {@code Builder}.
   * Does not affect any properties not set on the input.
   */
  public PsycheV2.Builder mergeFrom(PsycheV2.Builder template) {
    // Upcast to access private fields; otherwise, oddly, we get an access violation.
    PsycheV2_Builder base = (PsycheV2_Builder) template;
    PsycheV2_Builder _defaults = new PsycheV2.Builder();
    if (!base._unsetProperties.contains(PsycheV2_Builder.Property.HOST)
        && (_defaults._unsetProperties.contains(PsycheV2_Builder.Property.HOST)
            || !template.getHost().equals(_defaults.getHost()))) {
      setHost(template.getHost());
    }
    if (!base._unsetProperties.contains(PsycheV2_Builder.Property.PORT)
        && (_defaults._unsetProperties.contains(PsycheV2_Builder.Property.PORT)
            || !template.getPort().equals(_defaults.getPort()))) {
      setPort(template.getPort());
    }
    if (!base._unsetProperties.contains(PsycheV2_Builder.Property.UNIQUE_ID)
        && (_defaults._unsetProperties.contains(PsycheV2_Builder.Property.UNIQUE_ID)
            || !template.getUniqueId().equals(_defaults.getUniqueId()))) {
      setUniqueId(template.getUniqueId());
    }
    return (PsycheV2.Builder) this;
  }

  /**
   * Resets the state of this builder.
   */
  public PsycheV2.Builder clear() {
    PsycheV2_Builder _defaults = new PsycheV2.Builder();
    host = _defaults.host;
    port = _defaults.port;
    uniqueId = _defaults.uniqueId;
    _unsetProperties.clear();
    _unsetProperties.addAll(_defaults._unsetProperties);
    return (PsycheV2.Builder) this;
  }

  /**
   * Returns a newly-created {@link PsycheV2} based on the contents of the {@code Builder}.
   *
   * @throws IllegalStateException if any field has not been set
   */
  public PsycheV2 build() {
    Preconditions.checkState(_unsetProperties.isEmpty(), "Not set: %s", _unsetProperties);
    return new PsycheV2_Builder.Value(this);
  }

  /**
   * Returns a newly-created partial {@link PsycheV2}
   * based on the contents of the {@code Builder}.
   * State checking will not be performed.
   * Unset properties will throw an {@link UnsupportedOperationException}
   * when accessed via the partial object.
   *
   * <p>Partials should only ever be used in tests.
   */
  @VisibleForTesting()
  public PsycheV2 buildPartial() {
    return new PsycheV2_Builder.Partial(this);
  }

  private static final class Value implements PsycheV2 {
    private final String host;
    private final Integer port;
    private final String uniqueId;

    private Value(PsycheV2_Builder builder) {
      this.host = builder.host;
      this.port = builder.port;
      this.uniqueId = builder.uniqueId;
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
    public boolean equals(Object obj) {
      if (!(obj instanceof PsycheV2_Builder.Value)) {
        return false;
      }
      PsycheV2_Builder.Value other = (PsycheV2_Builder.Value) obj;
      return Objects.equals(host, other.host)
          && Objects.equals(port, other.port)
          && Objects.equals(uniqueId, other.uniqueId);
    }

    @Override
    public int hashCode() {
      return Objects.hash(host, port, uniqueId);
    }

    @Override
    public String toString() {
      return "PsycheV2{"
          + "host="
          + host
          + ", "
          + "port="
          + port
          + ", "
          + "uniqueId="
          + uniqueId
          + "}";
    }
  }

  private static final class Partial implements PsycheV2 {
    private final String host;
    private final Integer port;
    private final String uniqueId;
    private final EnumSet<PsycheV2_Builder.Property> _unsetProperties;

    Partial(PsycheV2_Builder builder) {
      this.host = builder.host;
      this.port = builder.port;
      this.uniqueId = builder.uniqueId;
      this._unsetProperties = builder._unsetProperties.clone();
    }

    @Override
    public String getHost() {
      if (_unsetProperties.contains(PsycheV2_Builder.Property.HOST)) {
        throw new UnsupportedOperationException("host not set");
      }
      return host;
    }

    @Override
    public Integer getPort() {
      if (_unsetProperties.contains(PsycheV2_Builder.Property.PORT)) {
        throw new UnsupportedOperationException("port not set");
      }
      return port;
    }

    @Override
    public String getUniqueId() {
      if (_unsetProperties.contains(PsycheV2_Builder.Property.UNIQUE_ID)) {
        throw new UnsupportedOperationException("uniqueId not set");
      }
      return uniqueId;
    }

    @Override
    public boolean equals(Object obj) {
      if (!(obj instanceof PsycheV2_Builder.Partial)) {
        return false;
      }
      PsycheV2_Builder.Partial other = (PsycheV2_Builder.Partial) obj;
      return Objects.equals(host, other.host)
          && Objects.equals(port, other.port)
          && Objects.equals(uniqueId, other.uniqueId)
          && Objects.equals(_unsetProperties, other._unsetProperties);
    }

    @Override
    public int hashCode() {
      return Objects.hash(host, port, uniqueId, _unsetProperties);
    }

    @Override
    public String toString() {
      return "partial PsycheV2{"
          + COMMA_JOINER.join(
              (!_unsetProperties.contains(PsycheV2_Builder.Property.HOST) ? "host=" + host : null),
              (!_unsetProperties.contains(PsycheV2_Builder.Property.PORT) ? "port=" + port : null),
              (!_unsetProperties.contains(PsycheV2_Builder.Property.UNIQUE_ID)
                  ? "uniqueId=" + uniqueId
                  : null))
          + "}";
    }
  }
}
