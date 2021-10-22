package package1;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FindValidSubstrings 
{
	public boolean findValidString(String s)
	{
		boolean flag = false;
		if(s.length()%2==0)
		{
			for(int i=0;i<s.length();i++)
			{
				if(s.charAt(i)==s.charAt(0))
				{
					flag = true;
				}
				else
				{
					flag = false;
					break;
				}
			}
		}
		else
		{
			int mid = s.length()/2;
			for(int i=0;i<s.length();i++)
			{
				if(i!=mid)
				{
					if(s.charAt(i)==s.charAt(0))
					{
						flag = true;
					}
					else
					{
						flag = false;
						break;
					}
		
				}
			}
		}
		return flag;
	}

	private int countValidStrings(String str) {
		List<String> list = new ArrayList<>();
		for(int i=0;i<str.length();i++)
		{
			list.add(String.valueOf(str.charAt(i)));
			for(int j=i+1;j<str.length();j++)
			{
				String sub = str.substring(i,j+1);
				if(findValidString(sub))
				{
					list.add(sub);
				}
			}
		}
		System.out.println(list.toString());
		int count = list.size();
		return count;
	}
	
	@Test
	public void testCase1()
	{
		Assert.assertEquals(countValidStrings("mnonopoo"), 12);
	}
	
	@Test
	public void testCase2()
	{
		Assert.assertEquals(countValidStrings("asasd"), 7);
	}
		
}




















