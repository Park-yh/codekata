SELECT ANIMAL_ID, NAME
from ANIMAL_INS
where lower(NAME) like '%el%' AND ANIMAL_TYPE = 'Dog'
order by NAME asc;