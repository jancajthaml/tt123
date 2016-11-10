#!/bin/bash

command -v python > /dev/null 2>&1 || {
  echo "missing binary \"python\" for `uname` OS, please install it manually and re-run"
  exit 3
}

python t3.py <<< "`cat <<-END
Lorem ipsum dolor sit amet, consectetur adipiscing elit. Suspendisse aliquam, lacus molestie luctus mattis, leo mauris iaculis leo, quis pellentesque odio sapien at justo. Sed pharetra euismod semper. Praesent interdum sed elit at suscipit. In ac egestas nunc, quis viverra justo. Nunc vulputate massa nibh, eu hendrerit felis molestie in. Praesent justo lectus, congue et enim vel, elementum rutrum quam. Morbi et egestas nulla. Integer quis urna quis ante viverra tempor. Nulla ligula arcu, vehicula nec porta at, placerat sed metus. Donec semper sed tortor vitae feugiat. Aenean bibendum massa a tortor dignissim bibendum.

Donec molestie dictum est. Phasellus sed ipsum rutrum, iaculis ipsum at, efficitur magna. Nam metus mauris, fermentum eu tempor vel, molestie vitae est. Phasellus pulvinar elit consectetur euismod vestibulum. Fusce maximus dolor eget ipsum facilisis, et maximus purus cursus. Aliquam erat volutpat. Morbi euismod dignissim mauris, in rutrum massa laoreet et. Cras dapibus dignissim elit eu dignissim.

Nunc maximus nisl nec suscipit ultricies. Nam auctor ligula a gravida vulputate. Integer laoreet ligula eget erat pretium, ac commodo libero laoreet. Sed felis eros, interdum ac elementum ac, luctus nec dui. Proin pulvinar, ipsum accumsan suscipit porta, lorem justo imperdiet ligula, id gravida sapien dolor vestibulum mauris. Nullam justo nisi, faucibus eu sapien iaculis, ornare aliquet erat. Sed pretium porttitor bibendum. Vivamus vitae odio elit. Nullam in imperdiet nibh, at iaculis felis. Maecenas pellentesque mi urna, sed rutrum arcu tincidunt ut. Curabitur ac velit nec sapien imperdiet interdum.

Nunc congue ut massa vitae faucibus. Ut nec dui accumsan, ullamcorper sapien sit amet, vulputate eros. Mauris tempus tempor vulputate. Nullam pellentesque bibendum urna, nec mollis elit faucibus at. Donec mattis, orci vitae pretium semper, nulla diam laoreet risus, vitae viverra enim nibh vel nisi. Phasellus leo nunc, finibus eget nisi ut, elementum mollis arcu. Cras quis turpis nec orci malesuada convallis. Aliquam lectus quam, varius molestie leo sit amet, ullamcorper facilisis orci. Cras at maximus ante. Nullam non erat et orci iaculis elementum. Phasellus at lorem nisl.

Vivamus a odio sed metus tincidunt cursus. Quisque lobortis semper blandit. Sed malesuada lectus sit amet dolor malesuada, a consequat tortor consectetur. Nulla facilisi. Donec vulputate ex malesuada, laoreet nibh malesuada, scelerisque felis. Donec ex magna, auctor dictum sem posuere, viverra feugiat mi. Vivamus dictum massa ut odio varius tristique. Sed et enim eu mauris tempus imperdiet non quis neque. Duis sed accumsan urna. Praesent vulputate arcu a orci scelerisque, et consectetur purus ullamcorper. Aliquam consectetur elit elit, sed viverra risus porttitor eget. Aenean id felis nec velit placerat vehicula egestas in quam. Etiam malesuada at nibh ac semper
END
)`"
