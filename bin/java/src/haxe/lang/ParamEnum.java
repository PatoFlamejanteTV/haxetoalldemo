// Generated by Haxe 4.3.6
package haxe.lang;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class ParamEnum extends haxe.lang.Enum
{
	public ParamEnum(int index, java.lang.Object[] params)
	{
		//line 241 "/usr/share/haxe/std/java/internal/HxObject.hx"
		super(index);
		//line 242 "/usr/share/haxe/std/java/internal/HxObject.hx"
		this.params = params;
	}
	
	
	public final java.lang.Object[] params;
	
	@Override public haxe.root.Array<java.lang.Object> getParams()
	{
		//line 246 "/usr/share/haxe/std/java/internal/HxObject.hx"
		if (( this.params == null )) 
		{
			//line 246 "/usr/share/haxe/std/java/internal/HxObject.hx"
			return new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{});
		}
		else
		{
			//line 246 "/usr/share/haxe/std/java/internal/HxObject.hx"
			java.lang.Object[] this1 = this.params;
			//line 246 "/usr/share/haxe/std/java/internal/HxObject.hx"
			haxe.root.Array a = new haxe.root.Array();
			//line 246 "/usr/share/haxe/std/java/internal/HxObject.hx"
			int len = ((java.lang.Object[]) (this1) ).length;
			//line 246 "/usr/share/haxe/std/java/internal/HxObject.hx"
			{
				//line 246 "/usr/share/haxe/std/java/internal/HxObject.hx"
				int _g = 0;
				//line 246 "/usr/share/haxe/std/java/internal/HxObject.hx"
				int _g1 = len;
				//line 246 "/usr/share/haxe/std/java/internal/HxObject.hx"
				while (( _g < _g1 ))
				{
					//line 246 "/usr/share/haxe/std/java/internal/HxObject.hx"
					int i = _g++;
					//line 246 "/usr/share/haxe/std/java/internal/HxObject.hx"
					a.__set(i, ((java.lang.Object[]) (this1) )[i]);
				}
				
			}
			
			//line 246 "/usr/share/haxe/std/java/internal/HxObject.hx"
			return ((haxe.root.Array<java.lang.Object>) (a) );
		}
		
	}
	
	
	@Override public java.lang.String toString()
	{
		//line 250 "/usr/share/haxe/std/java/internal/HxObject.hx"
		if (( ( this.params == null ) || ( ((java.lang.Object[]) (this.params) ).length == 0 ) )) 
		{
			//line 251 "/usr/share/haxe/std/java/internal/HxObject.hx"
			return this.getTag();
		}
		
		//line 252 "/usr/share/haxe/std/java/internal/HxObject.hx"
		haxe.root.StringBuf ret = new haxe.root.StringBuf();
		//line 253 "/usr/share/haxe/std/java/internal/HxObject.hx"
		ret.add(haxe.lang.Runtime.toString(this.getTag()));
		//line 253 "/usr/share/haxe/std/java/internal/HxObject.hx"
		java.lang.Object __temp_expr1 = ((java.lang.Object) (null) );
		//line 254 "/usr/share/haxe/std/java/internal/HxObject.hx"
		ret.add(haxe.lang.Runtime.toString("("));
		//line 254 "/usr/share/haxe/std/java/internal/HxObject.hx"
		java.lang.Object __temp_expr2 = ((java.lang.Object) (null) );
		//line 255 "/usr/share/haxe/std/java/internal/HxObject.hx"
		boolean first = true;
		//line 256 "/usr/share/haxe/std/java/internal/HxObject.hx"
		{
			//line 256 "/usr/share/haxe/std/java/internal/HxObject.hx"
			int _g = 0;
			//line 256 "/usr/share/haxe/std/java/internal/HxObject.hx"
			java.lang.Object[] _g1 = this.params;
			//line 256 "/usr/share/haxe/std/java/internal/HxObject.hx"
			while (( _g < ((java.lang.Object[]) (_g1) ).length ))
			{
				//line 256 "/usr/share/haxe/std/java/internal/HxObject.hx"
				java.lang.Object p = ((java.lang.Object[]) (_g1) )[_g];
				//line 256 "/usr/share/haxe/std/java/internal/HxObject.hx"
				 ++ _g;
				//line 257 "/usr/share/haxe/std/java/internal/HxObject.hx"
				if (first) 
				{
					//line 258 "/usr/share/haxe/std/java/internal/HxObject.hx"
					first = false;
				}
				else
				{
					//line 260 "/usr/share/haxe/std/java/internal/HxObject.hx"
					ret.add(haxe.lang.Runtime.toString(","));
					//line 260 "/usr/share/haxe/std/java/internal/HxObject.hx"
					java.lang.Object __temp_expr3 = ((java.lang.Object) (null) );
				}
				
				//line 261 "/usr/share/haxe/std/java/internal/HxObject.hx"
				ret.add(((java.lang.Object) (p) ));
				//line 261 "/usr/share/haxe/std/java/internal/HxObject.hx"
				java.lang.Object __temp_expr4 = ((java.lang.Object) (null) );
			}
			
		}
		
		//line 263 "/usr/share/haxe/std/java/internal/HxObject.hx"
		ret.add(haxe.lang.Runtime.toString(")"));
		//line 263 "/usr/share/haxe/std/java/internal/HxObject.hx"
		java.lang.Object __temp_expr5 = ((java.lang.Object) (null) );
		//line 264 "/usr/share/haxe/std/java/internal/HxObject.hx"
		return ret.toString();
	}
	
	
	@Override public boolean equals(java.lang.Object obj)
	{
		//line 268 "/usr/share/haxe/std/java/internal/HxObject.hx"
		if (haxe.lang.Runtime.eq(obj, this)) 
		{
			//line 269 "/usr/share/haxe/std/java/internal/HxObject.hx"
			return true;
		}
		
		//line 270 "/usr/share/haxe/std/java/internal/HxObject.hx"
		haxe.lang.ParamEnum obj1 = ( (( obj instanceof haxe.lang.ParamEnum )) ? (((haxe.lang.ParamEnum) (obj) )) : (null) );
		//line 271 "/usr/share/haxe/std/java/internal/HxObject.hx"
		boolean ret = ( ( ( obj1 != null ) && haxe.root.Std.isOfType(obj1, haxe.root.Type.getEnum(((java.lang.Object) (this) ))) ) && ( obj1.index == this.index ) );
		//line 272 "/usr/share/haxe/std/java/internal/HxObject.hx"
		if ( ! (ret) ) 
		{
			//line 273 "/usr/share/haxe/std/java/internal/HxObject.hx"
			return false;
		}
		
		//line 274 "/usr/share/haxe/std/java/internal/HxObject.hx"
		if (( obj1.params == this.params )) 
		{
			//line 275 "/usr/share/haxe/std/java/internal/HxObject.hx"
			return true;
		}
		
		//line 276 "/usr/share/haxe/std/java/internal/HxObject.hx"
		int len = 0;
		//line 277 "/usr/share/haxe/std/java/internal/HxObject.hx"
		boolean tmp = false;
		//line 277 "/usr/share/haxe/std/java/internal/HxObject.hx"
		if ( ! ((( ( obj1.params == null ) || ( this.params == null ) ))) ) 
		{
			//line 277 "/usr/share/haxe/std/java/internal/HxObject.hx"
			len = ((java.lang.Object[]) (this.params) ).length;
			//line 277 "/usr/share/haxe/std/java/internal/HxObject.hx"
			tmp = ( len != ((java.lang.Object[]) (obj1.params) ).length );
		}
		else
		{
			//line 277 "/usr/share/haxe/std/java/internal/HxObject.hx"
			tmp = true;
		}
		
		//line 277 "/usr/share/haxe/std/java/internal/HxObject.hx"
		if (tmp) 
		{
			//line 278 "/usr/share/haxe/std/java/internal/HxObject.hx"
			return false;
		}
		
		//line 279 "/usr/share/haxe/std/java/internal/HxObject.hx"
		{
			//line 279 "/usr/share/haxe/std/java/internal/HxObject.hx"
			int _g = 0;
			//line 279 "/usr/share/haxe/std/java/internal/HxObject.hx"
			int _g1 = len;
			//line 279 "/usr/share/haxe/std/java/internal/HxObject.hx"
			while (( _g < _g1 ))
			{
				//line 279 "/usr/share/haxe/std/java/internal/HxObject.hx"
				int i = _g++;
				//line 280 "/usr/share/haxe/std/java/internal/HxObject.hx"
				if ( ! (haxe.lang.Runtime.toBool(((java.lang.Boolean) (haxe.root.Type.enumEq(((java.lang.Object) (((java.lang.Object[]) (obj1.params) )[i]) ), ((java.lang.Object) (((java.lang.Object[]) (this.params) )[i]) ))) ))) ) 
				{
					//line 281 "/usr/share/haxe/std/java/internal/HxObject.hx"
					return false;
				}
				
			}
			
		}
		
		//line 283 "/usr/share/haxe/std/java/internal/HxObject.hx"
		return true;
	}
	
	
	@Override public int hashCode()
	{
		//line 287 "/usr/share/haxe/std/java/internal/HxObject.hx"
		int h = 19;
		//line 288 "/usr/share/haxe/std/java/internal/HxObject.hx"
		if (( this.params != null )) 
		{
			//line 289 "/usr/share/haxe/std/java/internal/HxObject.hx"
			int _g = 0;
			//line 289 "/usr/share/haxe/std/java/internal/HxObject.hx"
			java.lang.Object[] _g1 = this.params;
			//line 289 "/usr/share/haxe/std/java/internal/HxObject.hx"
			while (( _g < ((java.lang.Object[]) (_g1) ).length ))
			{
				//line 289 "/usr/share/haxe/std/java/internal/HxObject.hx"
				java.lang.Object p = ((java.lang.Object[]) (_g1) )[_g];
				//line 289 "/usr/share/haxe/std/java/internal/HxObject.hx"
				 ++ _g;
				//line 290 "/usr/share/haxe/std/java/internal/HxObject.hx"
				h *= 31;
				//line 291 "/usr/share/haxe/std/java/internal/HxObject.hx"
				if (( ! (( p == null )) )) 
				{
					//line 292 "/usr/share/haxe/std/java/internal/HxObject.hx"
					h = ((int) (haxe.lang.Runtime.toInt(((java.lang.Object) (haxe.lang.Runtime.plus(h, p.hashCode())) ))) );
				}
				
			}
			
		}
		
		//line 294 "/usr/share/haxe/std/java/internal/HxObject.hx"
		h += this.index;
		//line 295 "/usr/share/haxe/std/java/internal/HxObject.hx"
		return h;
	}
	
	
}


