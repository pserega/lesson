echo on
cd /d D:\_developer\sqldeveloper\sqldeveloper\bin\
sdcli reports generate -report junit_suite_report -db "local xe" -FILE "C:\Program Files (x86)\Jenkins\workspace\unit_plus\junit_suite_PLUS_v5" -bind "suite_name=TEST.PLUS_v5"
cd /d "C:\Program Files (x86)\Jenkins\workspace\unit_plus\"