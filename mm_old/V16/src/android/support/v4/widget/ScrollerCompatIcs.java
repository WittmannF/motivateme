// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.widget.OverScroller;

class ScrollerCompatIcs
{

    ScrollerCompatIcs()
    {
    }

    public static float getCurrVelocity(Object obj)
    {
        return ((OverScroller)obj).getCurrVelocity();
    }
}
