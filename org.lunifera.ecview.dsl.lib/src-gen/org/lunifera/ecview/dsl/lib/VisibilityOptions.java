package org.lunifera.ecview.dsl.lib;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import org.lunifera.ecview.core.common.visibility.Color;

@SuppressWarnings("all")
public class VisibilityOptions implements Serializable {
  private PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);
  
  private boolean disposed;
  
  private Color foregroundColor;
  
  private Color backgroundColor;
  
  private boolean editable;
  
  private boolean enabled;
  
  private boolean visible;
  
  private boolean bold;
  
  private boolean border;
  
  private boolean italic;
  
  private boolean strikethrough;
  
  private boolean underline;
  
  /**
   * Returns true, if the object is disposed. 
   * Disposed means, that it is prepared for garbage collection and may not be used anymore. 
   * Accessing objects that are already disposed will cause runtime exceptions.
   */
  public boolean isDisposed() {
    return this.disposed;
  }
  
  /**
   * @see PropertyChangeSupport#addPropertyChangeListener(PropertyChangeListener)
   */
  public void addPropertyChangeListener(final PropertyChangeListener listener) {
    propertyChangeSupport.addPropertyChangeListener(listener);
  }
  
  /**
   * @see PropertyChangeSupport#addPropertyChangeListener(String, PropertyChangeListener)
   */
  public void addPropertyChangeListener(final String propertyName, final PropertyChangeListener listener) {
    propertyChangeSupport.addPropertyChangeListener(propertyName, listener);
  }
  
  /**
   * @see PropertyChangeSupport#removePropertyChangeListener(PropertyChangeListener)
   */
  public void removePropertyChangeListener(final PropertyChangeListener listener) {
    propertyChangeSupport.removePropertyChangeListener(listener);
  }
  
  /**
   * @see PropertyChangeSupport#removePropertyChangeListener(String, PropertyChangeListener)
   */
  public void removePropertyChangeListener(final String propertyName, final PropertyChangeListener listener) {
    propertyChangeSupport.removePropertyChangeListener(propertyName, listener);
  }
  
  /**
   * @see PropertyChangeSupport#firePropertyChange(String, Object, Object)
   */
  public void firePropertyChange(final String propertyName, final Object oldValue, final Object newValue) {
    propertyChangeSupport.firePropertyChange(propertyName, oldValue, newValue);
  }
  
  /**
   * Checks whether the object is disposed.
   * @throws RuntimeException if the object is disposed.
   */
  private void checkDisposed() {
    if (isDisposed()) {
      throw new RuntimeException("Object already disposed: " + this);
    }
  }
  
  /**
   * Calling dispose will destroy that instance. The internal state will be 
   * set to 'disposed' and methods of that object must not be used anymore. 
   * Each call will result in runtime exceptions.<br/>
   * If this object keeps composition containments, these will be disposed too. 
   * So the whole composition containment tree will be disposed on calling this method.
   */
  public void dispose() {
    if (isDisposed()) {
      return;
    }
    disposed = true;
  }
  
  /**
   * Returns the foregroundColor property or <code>null</code> if not present.
   */
  public Color getForegroundColor() {
    checkDisposed();
    return this.foregroundColor;
  }
  
  /**
   * Sets the <code>foregroundColor</code> property to this instance.
   * 
   * @param foregroundColor - the property
   * @throws RuntimeException if instance is <code>disposed</code>
   * 
   */
  public void setForegroundColor(final Color foregroundColor) {
    firePropertyChange("foregroundColor", this.foregroundColor, this.foregroundColor = foregroundColor );
  }
  
  /**
   * Returns the backgroundColor property or <code>null</code> if not present.
   */
  public Color getBackgroundColor() {
    checkDisposed();
    return this.backgroundColor;
  }
  
  /**
   * Sets the <code>backgroundColor</code> property to this instance.
   * 
   * @param backgroundColor - the property
   * @throws RuntimeException if instance is <code>disposed</code>
   * 
   */
  public void setBackgroundColor(final Color backgroundColor) {
    firePropertyChange("backgroundColor", this.backgroundColor, this.backgroundColor = backgroundColor );
  }
  
  /**
   * Returns the editable property or <code>null</code> if not present.
   */
  public boolean isEditable() {
    checkDisposed();
    return this.editable;
  }
  
  /**
   * Sets the <code>editable</code> property to this instance.
   * 
   * @param editable - the property
   * @throws RuntimeException if instance is <code>disposed</code>
   * 
   */
  public void setEditable(final boolean editable) {
    firePropertyChange("editable", this.editable, this.editable = editable );
  }
  
  /**
   * Returns the enabled property or <code>null</code> if not present.
   */
  public boolean isEnabled() {
    checkDisposed();
    return this.enabled;
  }
  
  /**
   * Sets the <code>enabled</code> property to this instance.
   * 
   * @param enabled - the property
   * @throws RuntimeException if instance is <code>disposed</code>
   * 
   */
  public void setEnabled(final boolean enabled) {
    firePropertyChange("enabled", this.enabled, this.enabled = enabled );
  }
  
  /**
   * Returns the visible property or <code>null</code> if not present.
   */
  public boolean isVisible() {
    checkDisposed();
    return this.visible;
  }
  
  /**
   * Sets the <code>visible</code> property to this instance.
   * 
   * @param visible - the property
   * @throws RuntimeException if instance is <code>disposed</code>
   * 
   */
  public void setVisible(final boolean visible) {
    firePropertyChange("visible", this.visible, this.visible = visible );
  }
  
  /**
   * Returns the bold property or <code>null</code> if not present.
   */
  public boolean isBold() {
    checkDisposed();
    return this.bold;
  }
  
  /**
   * Sets the <code>bold</code> property to this instance.
   * 
   * @param bold - the property
   * @throws RuntimeException if instance is <code>disposed</code>
   * 
   */
  public void setBold(final boolean bold) {
    firePropertyChange("bold", this.bold, this.bold = bold );
  }
  
  /**
   * Returns the border property or <code>null</code> if not present.
   */
  public boolean isBorder() {
    checkDisposed();
    return this.border;
  }
  
  /**
   * Sets the <code>border</code> property to this instance.
   * 
   * @param border - the property
   * @throws RuntimeException if instance is <code>disposed</code>
   * 
   */
  public void setBorder(final boolean border) {
    firePropertyChange("border", this.border, this.border = border );
  }
  
  /**
   * Returns the italic property or <code>null</code> if not present.
   */
  public boolean isItalic() {
    checkDisposed();
    return this.italic;
  }
  
  /**
   * Sets the <code>italic</code> property to this instance.
   * 
   * @param italic - the property
   * @throws RuntimeException if instance is <code>disposed</code>
   * 
   */
  public void setItalic(final boolean italic) {
    firePropertyChange("italic", this.italic, this.italic = italic );
  }
  
  /**
   * Returns the strikethrough property or <code>null</code> if not present.
   */
  public boolean isStrikethrough() {
    checkDisposed();
    return this.strikethrough;
  }
  
  /**
   * Sets the <code>strikethrough</code> property to this instance.
   * 
   * @param strikethrough - the property
   * @throws RuntimeException if instance is <code>disposed</code>
   * 
   */
  public void setStrikethrough(final boolean strikethrough) {
    firePropertyChange("strikethrough", this.strikethrough, this.strikethrough = strikethrough );
  }
  
  /**
   * Returns the underline property or <code>null</code> if not present.
   */
  public boolean isUnderline() {
    checkDisposed();
    return this.underline;
  }
  
  /**
   * Sets the <code>underline</code> property to this instance.
   * 
   * @param underline - the property
   * @throws RuntimeException if instance is <code>disposed</code>
   * 
   */
  public void setUnderline(final boolean underline) {
    firePropertyChange("underline", this.underline, this.underline = underline );
  }
  
  public VisibilityOptions createDto() {
    return new VisibilityOptions();
  }
  
  public VisibilityOptions copy(final org.lunifera.dsl.dto.lib.Context context) {
    checkDisposed();
    
    if (context == null) {
    	throw new IllegalArgumentException("Context must not be null!");
    }
    
    if(context.isMaxLevel()){
    	return null;
    }
    
    // if context contains a copied instance of this object
    // then return it
    VisibilityOptions newDto = context.getTarget(this);
    if(newDto != null){
    	return newDto;
    }
    
    try{
    	context.increaseLevel();
    	
    	newDto = createDto();
    	context.register(this, newDto);
    	
    	// first copy the containments and attributes
    	copyContainments(this, newDto, context);
    	
    	// then copy cross references to ensure proper
    	// opposite references are copied too.
    	copyCrossReferences(this, newDto, context);
    } finally {
    	context.decreaseLevel();
    }
    
    return newDto;
  }
  
  public void copyContainments(final VisibilityOptions dto, final VisibilityOptions newDto, final org.lunifera.dsl.dto.lib.Context context) {
    checkDisposed();
    
    if (context == null) {
    	throw new IllegalArgumentException("Context must not be null!");
    }
    
    
    // copy attributes and beans (beans if derived from entity model)
    // copy foregroundColor
    newDto.setForegroundColor(getForegroundColor());
    // copy backgroundColor
    newDto.setBackgroundColor(getBackgroundColor());
    // copy editable
    newDto.setEditable(isEditable());
    // copy enabled
    newDto.setEnabled(isEnabled());
    // copy visible
    newDto.setVisible(isVisible());
    // copy bold
    newDto.setBold(isBold());
    // copy border
    newDto.setBorder(isBorder());
    // copy italic
    newDto.setItalic(isItalic());
    // copy strikethrough
    newDto.setStrikethrough(isStrikethrough());
    // copy underline
    newDto.setUnderline(isUnderline());
    
    // copy containment references (cascading is true)
  }
  
  public void copyCrossReferences(final VisibilityOptions dto, final VisibilityOptions newDto, final org.lunifera.dsl.dto.lib.Context context) {
    checkDisposed();
    
    if (context == null) {
    	throw new IllegalArgumentException("Context must not be null!");
    }
    
    
    // copy cross references (cascading is false)
  }
}
