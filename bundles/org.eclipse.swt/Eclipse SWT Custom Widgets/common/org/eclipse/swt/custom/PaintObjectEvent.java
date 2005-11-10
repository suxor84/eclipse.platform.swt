/*******************************************************************************
 * Copyright (c) 2000, 2005 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.swt.custom;

import org.eclipse.swt.events.*;
import org.eclipse.swt.graphics.*;

/**
 * This event is sent when an object needs to be drawn.
 * 
 * @since 3.2
 */
public class PaintObjectEvent extends TypedEvent {
	
	/**
	 * the GC
	 */
	public GC gc;
	
	/**
	 * the x location
	 */
	public int x;
	
	/**
	 * the y location
	 */
	public int y;
	
	/**
	 * the line ascent
	 */
	public int ascent;
	
	/**
	 * the descent location
	 */
	public int descent;
	
	/**
	 * the GlyphMetrics
	 */
	public GlyphMetrics metrics;
	
	/**
	 * the start offset
	 */
	public int start;

	/**
	 * the length
	 */
	public int length;
	
//	public Bullet bullet;
	
	static final long serialVersionUID = 3906081274027192855L;
	
public PaintObjectEvent(StyledTextEvent e) {
	super(e);
	gc = e.gc;
	x = e.x;
	y = e.y;
	ascent = e.ascent;
	descent = e.descent;
	metrics = e.metrics;
	start = e.start;
	length = e.length;
//	bullet = e.bullet;
}
}
