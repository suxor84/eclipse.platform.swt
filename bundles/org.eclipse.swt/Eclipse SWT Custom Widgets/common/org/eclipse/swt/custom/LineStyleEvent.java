/*******************************************************************************
 * Copyright (c) 2000, 2004 IBM Corporation and others.
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

/**
 * This event is sent when a line is about to be drawn.
 */
public class LineStyleEvent extends TypedEvent {
	
	/**
	 * line start offset (input)
	 */
	public int lineOffset;
	
	/**
	 * line text (input)
	 */
	public String lineText;
	
	/**
	 * line ranges (output)
	 */
	public int[] ranges;
	
	/**
	 * line styles (output)
	 */
	public StyleRange[] styles;

	/** 
	 * line alignment (input, output)
	 */
	public int alignment;

	/**
	 * line indent (input, output)
	 */
	public int indent;

	/** 
	 * line justification (input, output)
	 */
	public boolean justify;

	/**
	 * line bullet (output)
	 */
	Bullet bullet;
	
	static final long serialVersionUID = 3906081274027192884L;
	
public LineStyleEvent(StyledTextEvent e) {
	super(e);
	lineOffset = e.detail;
	lineText = e.text;
	alignment = e.alignment;
	justify = e.justify;
	indent = e.indent;
}
}
