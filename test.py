import os,re
directory = os.scandir('')

entries = [it.name for it in directory]
for i in entries:
	file = i
	with open (file, 'r+', encoding='utf-8') as f1:
		text5 = f1.read()
		pattern5 = r'https://xcxc82.github.io/'
		text5 = re.sub(pattern5,'https://xcxc82.moe/',text5)
		with open (file,'w',encoding='utf-8') as f2:
			f2.write(text5)

#file = 'examplefortext'+'.md'
#with open (file, 'r+', encoding='utf-8') as f1:
	#text5 = f1.read()
	#pattern5 = r'()'
	#text5 = re.sub(pattern5,'',text5)
	#with open (file,'w',encoding='utf-8') as f2:
		#f2.write(text5)